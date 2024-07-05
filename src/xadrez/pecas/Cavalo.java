package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.CorPeca;
import xadrez.PecaXadrez;

public class Cavalo extends PecaXadrez {

	public Cavalo(Tabuleiro tabuleiro, CorPeca corPeca) {
		super(tabuleiro, corPeca);
	}

	@Override
	public String toString() {
		return "C";
	}
}
