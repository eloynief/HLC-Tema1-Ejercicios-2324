package ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio3Test {
	
	/**
	 * comprobacion del multiplo de 3
	 */
	@Test
	void testMultiplo3() {
		String res=Ejercicio3.multiplos(3);
		
		
		assertTrue(res.equals("fizz"));
	}

	/**
	 * comprobacion del multiplo de 5
	 */
	@Test
	void testMultiplo5() {
		String res=Ejercicio3.multiplos(5);
		
		
		assertTrue(res.equals("buzz"));
	}

	/**
	 * comprobacion del multiplo de 3 y 5
	 */
	@Test
	void testMultiplos() {
		String res=Ejercicio3.multiplos(15);
		
		
		assertTrue(res.equals("fizzbuzz"));
	}


}
