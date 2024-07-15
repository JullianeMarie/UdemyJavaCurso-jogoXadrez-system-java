package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.XadrezException;
import xadrez.XadrezPosicao;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();

		while (true) {
			try {
				UI.limpaTela();
				UI.printTabuleiro(partidaXadrez.getPecas());
				System.out.println();
				System.out.print("Origem: ");
				XadrezPosicao origem = UI.lerXadrezPosicao(sc);

				System.out.println();
				System.out.print("Destino: ");
				XadrezPosicao destino = UI.lerXadrezPosicao(sc);

				PecaXadrez capturaPeca = partidaXadrez.executarMovimentoXadrez(origem, destino);

			} catch (XadrezException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
