package ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	void testIsEven() {
		//habra una comprobacion
		boolean res=Ejercicio2.isEven(0);
		assertTrue(res);
	}
	
	@Test
	void testIsNotEven() {
		//habra una comprobacion
		boolean res=Ejercicio2.isEven(1);
		assertFalse(res);
	}

}
