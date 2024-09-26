package ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Ejercicio1Test {

	
	@ParameterizedTest //test con parametros
	@MethodSource("vocalista")
	void testEsVocal(char caracter, boolean resEsperado) {
		boolean resObtenido= Ejercicio1.esVocal(caracter);
		
		assertEquals(resEsperado,resObtenido);
	}
	
	
	private static Stream<Arguments> vocalista() {
		return Stream.of(
			Arguments.of('a',true),
			Arguments.of('e',true),
			Arguments.of('i',true),
			Arguments.of('o',true),
			Arguments.of('u',true),
			Arguments.of('b',false)
		);
		
		
	}
	
	
	
//	@Test
//	void testEsVocalA() {
//		boolean res= Ejercicio1.esVocal('a');
//		
//		
//		assertTrue(res);
//	}
//
//	@Test
//	void testEsVocalMayusA() {
//		boolean res= Ejercicio1.esVocal('A');
//		
//		
//		assertTrue(res);
//	}
//
//	@Test
//	void testEsVocalE() {
//		boolean res= Ejercicio1.esVocal('e');
//		
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testEsVocalMayusE() {
//		boolean res= Ejercicio1.esVocal('E');
//		
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testEsVocalI() {
//	    boolean res = Ejercicio1.esVocal('i');
//	    assertTrue(res);
//	}
//
//	@Test
//	void testEsVocalMayusI() {
//	    boolean res = Ejercicio1.esVocal('I');
//	    assertTrue(res);
//	}
//
//	@Test
//	void testEsVocalO() {
//	    boolean res = Ejercicio1.esVocal('o');
//	    assertTrue(res);
//	}
//
//	@Test
//	void testEsVocalMayusO() {
//	    boolean res = Ejercicio1.esVocal('O');
//	    assertTrue(res);
//	}
//
//	@Test
//	void testEsVocalU() {
//	    boolean res = Ejercicio1.esVocal('u');
//	    assertTrue(res);
//	}
//
//	@Test
//	void testEsVocalMayusU() {
//	    boolean res = Ejercicio1.esVocal('U');
//	    assertTrue(res);
//	}
//
//
//	@Test
//	void testEsVocalConsonante() {
//	    boolean res = Ejercicio1.esVocal('B');
//	    assertFalse(res);
//	}

	
	
}
