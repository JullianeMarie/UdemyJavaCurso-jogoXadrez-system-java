package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca {

	private CorPeca corPeca;

	public PecaXadrez(Tabuleiro tabuleiro, CorPeca corPeca) {
		super(tabuleiro);
		this.corPeca = corPeca;
	}

	public CorPeca getCorPeca() {
		return corPeca;
	}

	
}
