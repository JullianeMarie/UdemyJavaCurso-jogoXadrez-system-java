package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Bispo;
import xadrez.pecas.Cavalo;
import xadrez.pecas.Peao;
import xadrez.pecas.Rainha;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		inicioPartida();
	}

	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for (int i = 0; i < tabuleiro.getLinha(); i++) {
			for (int j = 0; j < tabuleiro.getColuna(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.pecas(i, j);
			}
		}
		return mat;
	}

	public void inicioPartida() {
		tabuleiro.localPeca(new Torre(tabuleiro, CorPeca.PRETA), new Posicao (0, 0));
		tabuleiro.localPeca(new Cavalo(tabuleiro, CorPeca.PRETA), new Posicao (0, 1));
		tabuleiro.localPeca(new Bispo(tabuleiro, CorPeca.PRETA), new Posicao (0, 2));
		tabuleiro.localPeca(new Rainha(tabuleiro, CorPeca.PRETA), new Posicao (0, 3));
		tabuleiro.localPeca(new Rei(tabuleiro, CorPeca.PRETA), new Posicao (0, 4));
		tabuleiro.localPeca(new Bispo(tabuleiro, CorPeca.PRETA), new Posicao (0, 5));
		tabuleiro.localPeca(new Cavalo(tabuleiro, CorPeca.PRETA), new Posicao (0, 6));
		tabuleiro.localPeca(new Torre(tabuleiro, CorPeca.PRETA), new Posicao (0, 7));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.PRETA), new Posicao (1, 0));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.PRETA), new Posicao (1, 1));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.PRETA), new Posicao (1, 2));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.PRETA), new Posicao (1, 3));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.PRETA), new Posicao (1, 4));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.PRETA), new Posicao (1, 5));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.PRETA), new Posicao (1, 6));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.PRETA), new Posicao (1, 7));
		
		
		tabuleiro.localPeca(new Torre(tabuleiro, CorPeca.BRANCA), new Posicao (7, 0));
		tabuleiro.localPeca(new Cavalo(tabuleiro, CorPeca.BRANCA), new Posicao (7,1));
		tabuleiro.localPeca(new Bispo(tabuleiro, CorPeca.BRANCA), new Posicao (7, 2));
		tabuleiro.localPeca(new Rainha(tabuleiro, CorPeca.BRANCA), new Posicao (7, 3));
		tabuleiro.localPeca(new Rei(tabuleiro, CorPeca.BRANCA), new Posicao (7, 4));
		tabuleiro.localPeca(new Bispo(tabuleiro, CorPeca.BRANCA), new Posicao (7, 5));
		tabuleiro.localPeca(new Cavalo(tabuleiro, CorPeca.BRANCA), new Posicao (7, 6));
		tabuleiro.localPeca(new Torre(tabuleiro, CorPeca.BRANCA), new Posicao (7, 7));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.BRANCA), new Posicao (6, 0));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.BRANCA), new Posicao (6, 1));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.BRANCA), new Posicao (6, 2));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.BRANCA), new Posicao (6, 3));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.BRANCA), new Posicao (6, 4));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.BRANCA), new Posicao (6, 5));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.BRANCA), new Posicao (6, 6));
		tabuleiro.localPeca(new Peao(tabuleiro, CorPeca.BRANCA), new Posicao (6, 7));
	
	
	}
}




















