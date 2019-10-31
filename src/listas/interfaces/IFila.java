package listas.interfaces;

import listas.Conta;

public interface IFila<T> {
	
	public void equeue(Conta T);
	public Conta dequeue();
	public int size();
	public Conta getFront();
	public Conta getReare();
	public boolean isEmpty();
	

}
