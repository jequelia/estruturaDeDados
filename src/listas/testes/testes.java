package listas.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import listas.Conta;
import listas.implementacoes.FilaSequencial;
import listas.implementacoes.ListSequencial;
import listas.implementacoes.PilhaSequencial;

public class testes {

	@Test
	void PilhaSequencialPush() {
		PilhaSequencial lista = new PilhaSequencial();
		Conta contaA = new Conta(123, "Jequelia");
		lista.push(contaA);
		assertEquals(contaA, lista.top());
	}
	
	@Test
	void PilhaEncadeadaPush() {
		PilhaSequencial lista = new PilhaSequencial();
		Conta contaA = new Conta(123, "Jequelia");
		lista.push(contaA);
		assertEquals(contaA, lista.top());
	}
	

	@Test
	void FilaSequencialClear() {
		FilaSequencial lista = new FilaSequencial();
		Conta contaA = new Conta(123, "Jequelia");
		lista.equeue(contaA);
		lista.dequeue();
		assertEquals(lista.size(),0);
		
	}

	@Test
	void removerContaNaPosicaoTest() {
		ListSequencial lista = new ListSequencial();
		Conta contaA = new Conta(123, "Jequelia");
		Conta contaB = new Conta(123, "Wesley");
		Conta contaC = new Conta(123, "lazaro");
		lista.add(contaA);
		lista.add(contaB);
		lista.add(contaC);
		lista.remove(0);
		assertEquals(2, lista.size());
		assertEquals(contaB, lista.get(0));
		
	}
}
