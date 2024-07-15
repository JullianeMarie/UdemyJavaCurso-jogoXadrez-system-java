package application;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.XadrezPosicao;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();

		while (true) {
			UI.printTabuleiro(partidaXadrez.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			XadrezPosicao origem = UI.lerXadrezPosicao(sc);
			
			System.out.println();
			System.out.print("Destino: ");
			XadrezPosicao destino = UI.lerXadrezPosicao(sc);
			
			PecaXadrez capturaPeca = partidaXadrez.executarMovimentoXadrez(origem, destino);
			
			
		}
	}
}
