package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.CorPeca;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabuleiro, CorPeca corPeca) {
		super(tabuleiro, corPeca);
	}

	@Override
	public String toString() {
		return "T";
	}
}
