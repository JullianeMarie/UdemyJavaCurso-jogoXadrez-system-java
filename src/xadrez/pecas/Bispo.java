package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.CorPeca;
import xadrez.PecaXadrez;

public class Bispo extends PecaXadrez {

	public Bispo(Tabuleiro tabuleiro, CorPeca corPeca) {
		super(tabuleiro, corPeca);
	}

	@Override
	public String toString() {
		return "B";
	}
}
