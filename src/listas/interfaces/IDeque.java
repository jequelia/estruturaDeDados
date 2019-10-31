package listas.interfaces;

import listas.Conta;

public interface IDeque<T> {
	public int size();
	public void insertFront(Conta T);
	public void insertLast(Conta T);
	public Conta deleteFront();
	public Conta deleteLast();
	public Conta getFront();
	public Conta getReare();
	public boolean isEmpty();

}