package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.CorPeca;
import xadrez.PecaXadrez;

public class Rainha extends PecaXadrez {

	public Rainha(Tabuleiro tabuleiro, CorPeca corPeca) {
		super(tabuleiro, corPeca);
	}

	@Override
	public String toString() {
		return "R";
	}
}

