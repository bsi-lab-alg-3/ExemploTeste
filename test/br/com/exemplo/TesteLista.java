package br.com.exemplo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TesteLista extends TestCase{

	private int x = 1;
	private int y = 1;
	
	@Before
	protected void inicializar(){
		System.out.println("Iniciando tudo..");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testeX1(){
		assertEquals(x, 1);
	}
	
	@Test
	public void testeNotX1(){
		assertNotEquals(x, 0);
	}

}
