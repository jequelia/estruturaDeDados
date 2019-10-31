package listas.implementacoes;

import listas.Conta;

public class FilaSequencial implements listas.interfaces.IFila<Conta> {
	
	private static final int TAMANHO_INICIAL = 2;
	private Conta[] contas;
	private int posicaoAtual;
	private int inseridos;
	
	public FilaSequencial() {
		contas = new Conta[TAMANHO_INICIAL];
	}

	@Override
	public void equeue(Conta cont) {
		if (posicaoAtual >= contas.length) {
			Conta[] contasTemp = new Conta[contas.length * 2];
			for (int i = 0; i < contas.length; i++) {
				contasTemp[i] = contas[i];
			}
			contas = contasTemp;
		}
		contas[posicaoAtual++] = cont;
		inseridos ++;
	}

	@Override
	public Conta dequeue() {
		Conta retorno = contas[0];
		int j = 0;
		if(contas[0] != null) {
			Conta[] contasTemp = new Conta[this.size()];
			contas[0] = null;
			for (int i = 0; i < contas.length; i++) {
				if(contas[i] != null) {
					contasTemp[j++] = contas[i];
				}
			}
			contas = contasTemp;	
		}
		return retorno;
	}

	@Override
	public int size() {
		return inseridos;
	}

	@Override
	public Conta getFront() {
		return contas[0];
	}

	@Override
	public Conta getReare() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return contas.length != 0;
	}

}
