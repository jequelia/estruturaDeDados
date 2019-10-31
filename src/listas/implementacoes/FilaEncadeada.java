package listas.implementacoes;

import listas.Conta;


public class FilaEncadeada implements listas.interfaces.IFila<Conta> {
	
	private Conta inicio;
	private int inseridos;

	@Override
	public void equeue(Conta cont) {
		if(inicio ==null) {
			inicio = cont;
		}else {
			Conta temp = inicio;
			while(temp.proxima != null) {
				temp = temp.proxima;
			}
			temp.proxima = cont;
		}
		inseridos ++;
	}

	@Override
	public Conta dequeue() {
		Conta temp = null;
		if(inicio!=null) {
			temp = inicio;
			inicio= inicio.proxima;
			inseridos --;
			
		}
		return temp;
	}

	@Override
	public int size() {
		return inseridos;
	}

	@Override
	public Conta getFront() {
		return inicio;
	}

	@Override
	public Conta getReare() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return inseridos != 0;
	}

}
