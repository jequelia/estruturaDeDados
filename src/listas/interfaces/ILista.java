package listas.interfaces;

public interface ILista<T> {
	
	public void add(T obj);
	public void add(T obj, int posicao);
	public void remove(int posicao);
	public T get(int posicao);
	public int size();
	
}
