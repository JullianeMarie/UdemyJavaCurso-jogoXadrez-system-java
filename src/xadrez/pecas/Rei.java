package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.CorPeca;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

	public Rei(Tabuleiro tabuleiro, CorPeca corPeca) {
		super(tabuleiro, corPeca);
	}

	@Override
	public String toString() {
		return "K";
	}
}
