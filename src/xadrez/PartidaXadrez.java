package xadrez;

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
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}

	private void localNovaPeca(char coluna, int linha, PecaXadrez peca ) {
		tabuleiro.localPeca(peca, new XadrezPosicao(coluna, linha).paraPosicao());
	}
	
	public void inicioPartida() {
		localNovaPeca('a', 8, new Torre(tabuleiro, CorPeca.PRETA));
		localNovaPeca('b', 8, new Cavalo(tabuleiro, CorPeca.PRETA));
		localNovaPeca('c', 8, new Bispo(tabuleiro, CorPeca.PRETA));
		localNovaPeca('d', 8, new Rainha(tabuleiro, CorPeca.PRETA));
		localNovaPeca('e', 8, new Rei(tabuleiro, CorPeca.PRETA));
		localNovaPeca('f', 8, new Bispo(tabuleiro, CorPeca.PRETA));
		localNovaPeca('g', 8, new Cavalo(tabuleiro, CorPeca.PRETA));
		localNovaPeca('h', 8, new Torre(tabuleiro, CorPeca.PRETA));
		localNovaPeca('a', 7, new Peao(tabuleiro, CorPeca.PRETA));
		localNovaPeca('b', 7, new Peao(tabuleiro, CorPeca.PRETA));
		localNovaPeca('c', 7, new Peao(tabuleiro, CorPeca.PRETA));
		localNovaPeca('d', 7, new Peao(tabuleiro, CorPeca.PRETA));
		localNovaPeca('e', 7, new Peao(tabuleiro, CorPeca.PRETA));
		localNovaPeca('f', 7, new Peao(tabuleiro, CorPeca.PRETA));
		localNovaPeca('g', 7, new Peao(tabuleiro, CorPeca.PRETA));
		localNovaPeca('h', 7, new Peao(tabuleiro, CorPeca.PRETA));
		
		
		localNovaPeca('a', 1, new Torre(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('b', 1, new Cavalo(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('c', 1, new Bispo(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('d', 1, new Rainha(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('e', 1, new Rei(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('f', 1, new Bispo(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('g', 1, new Cavalo(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('h', 1, new Torre(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('a', 2, new Peao(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('b', 2, new Peao(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('c', 2, new Peao(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('d', 2, new Peao(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('e', 2, new Peao(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('f', 2, new Peao(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('g', 2, new Peao(tabuleiro, CorPeca.BRANCA));
		localNovaPeca('h', 2, new Peao(tabuleiro, CorPeca.BRANCA));
	
	
	}
}




















