package listas.implementacoes;

import listas.Conta;

public class PilhaSequencial implements listas.interfaces.Pilha<Conta> {
	
	private static final int TAMANHO_INICIAL = 2;
	private Conta[] contas;
	int posicaoAtual;
	
	public PilhaSequencial() {
		contas = new Conta[TAMANHO_INICIAL];
	}


	@Override
	public int size() {
		return posicaoAtual;
	}

	@Override
	public Conta top() {
		return contas[posicaoAtual];
	}

	@Override
	public Conta pop() {
		
		return contas[posicaoAtual--];
	
	}

	@Override
	public void push(Conta obj) {
		if (posicaoAtual == contas.length) {
			Conta[] contasTemp = new Conta[contas.length * 2];
			for (int i = 0; i < contas.length; i++) {
				contasTemp[i] = contas[i];
			}
			contas = contasTemp;
		}
		contas[posicaoAtual++] = obj;
		
	}
	
}
