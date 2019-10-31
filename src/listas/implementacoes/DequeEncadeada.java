package listas.implementacoes;

import listas.Conta;
import listas.interfaces.IDeque;


public class DequeEncadeada  implements IDeque<Conta>{
	
	private Conta inicio;
	private int inseridos;

	@Override
	public int size() {
		return inseridos;
	}

	@Override
	public void insertFront(Conta cont) {
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

	@Override
	public void insertLast(Conta cont) {
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
	public Conta deleteFront() {
		Conta conta = null;
		if(inicio!= null) {
			conta = inicio;
			inicio = inicio.proxima;
		}
		inseridos --;
		return conta;
	}

	@Override
	public Conta deleteLast() {
		return null;
	}

	@Override
	public Conta getFront() {
		return inicio;
	}

	@Override
	public Conta getReare() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return inseridos != 0;
	}

}
