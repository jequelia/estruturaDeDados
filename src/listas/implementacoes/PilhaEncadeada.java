package listas.implementacoes;

import listas.Conta;

public class PilhaEncadeada implements listas.interfaces.Pilha<Conta>  {
	
	private Conta inicio;
	private int inseridos;

	@Override
	public int size() {
		return inseridos;
	}

	@Override
	public Conta top() {
		return inicio;
	}

	@Override
	public Conta pop() {
		Conta conta = null;
		if(inicio!= null) {
			conta = inicio;
			inicio = inicio.proxima;
		}
		inseridos --;
		return conta;
	}

	@Override
	public void push(Conta cont) {
		
		if(inicio == null) {
			inicio = cont;
		}
		else {
			Conta temp = inicio;
			this.inicio = cont;
			inicio.proxima = temp;
		}
		inseridos ++;
	}

	
}
