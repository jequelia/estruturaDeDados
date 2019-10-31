package listas;

public class Conta {
	
	private int agencia;
	private String nome;
	public Conta proxima;
	
	public Conta( int agencia, String nome) {
		this.agencia = agencia;
		this.nome = nome;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String toString() {
		return "nome: " + getNome();
	}

	public Conta getProxima() {
		return proxima;
	}

	public void setProxima(Conta proxima) {
		this.proxima = proxima;
	}

}
