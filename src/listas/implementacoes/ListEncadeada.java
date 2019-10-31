package listas.implementacoes;

import listas.Conta;

public class ListEncadeada {
	private Conta inicio;
	private int inseridos;
	
	
	public void addLast(Conta cont) {
		
		if(inicio == null) {
			inicio = cont;
		}
		else {
			Conta temp = inicio;
			while(temp.proxima != null) {
				temp = temp.proxima;
			}
			temp.proxima = cont;
		}
		inseridos ++;
	}
	
	public void addFront(Conta cont) {
		Conta temp = inicio;
		inicio = cont;
		inicio.proxima = temp;
		inseridos ++;
	}
	
	public Conta getInicio() {
		return inicio;
	}
	public void setInicio(Conta inicio) {
		this.inicio = inicio;
	}
	public int getInseridos() {
		return inseridos;
	}
	public void setInseridos(int inseridos) {
		this.inseridos = inseridos;
	}
	

}
