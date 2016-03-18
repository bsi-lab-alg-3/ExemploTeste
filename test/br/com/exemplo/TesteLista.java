package br.com.exemplo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteLista{

	boolean booleanTeste = true;

	@BeforeClass
	public static void carregarLista() {
		// intanciar a minha lista
		// adicionar valores
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void exemploSucesso() {
		assertEquals(1, 1);
	}

	@Test
	public void testePreOrdem() {
		assertEquals("10,20,40", "10,40,20");
	}

	@Test(expected = ArithmeticException.class)
	public void falhaMatematica() {
		float valor = 1 / 0;
	};
	
	@Test
	public void testeDeVerdade(){
		if(booleanTeste){
			fail("O resultado foi positivo!");
		}
	}

}
