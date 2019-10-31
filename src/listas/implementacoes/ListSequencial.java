package listas.implementacoes;

import listas.Conta;
import listas.interfaces.ILista;

public class ListSequencial implements ILista<Conta> {

	private static final int TAMANHO_INICIAL = 2;
	private Conta[] contas;
	int posicaoAtual;

	public ListSequencial() {
		contas = new Conta[TAMANHO_INICIAL];
	}

	@Override
	public void add(Conta obj) {
		if (posicaoAtual >= contas.length) {
			Conta[] contasTemp = new Conta[contas.length * 2];
			for (int i = 0; i < contas.length; i++) {
				contasTemp[i] = contas[i];
			}
			contas = contasTemp;
		}
		contas[posicaoAtual++] = obj;
	}
	
	@Override
	public void add(Conta obj, int posicao) {
		if(posicao > contas.length || posicao < 0) {
			throw new ArrayIndexOutOfBoundsException(posicao);
		}
		int j = 0;
		Conta[] contasTemp = new Conta[contas.length * 2];
		for (int i = 0; i < contas.length; i++) {
			if (posicao == i) {
				contasTemp[j++] = obj;
			}
			contasTemp[j++] = contas[i];
		}
		contas = contasTemp;
		posicaoAtual++;
	}

	@Override
	public void remove(int posicao) {
		int j = 0;
		Conta[] contasTemp = new Conta[this.size()];
		contas[posicao] = null;
		
		for (int i = 0; i < contas.length; i++) {
			if(contas[i] != null) {
				contasTemp[j++] = contas[i];
			}
		}
		contas = contasTemp;
		posicaoAtual--;
	}

	@Override
	public Conta get(int posicao) {
		return contas[posicao];
	}

	@Override			
	public int size() {
		return posicaoAtual;
	}

}
