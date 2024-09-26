package ej4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ej4.Ejercicio4;

class Ejercicio4Test {
	
	//funciones y metodos
	
	@ParameterizedTest //test con parametros
	@MethodSource("tests")
	void esPrimo(int num, boolean resEsperado) {
		
		boolean resObtenido= Ejercicio4.esPrimo(num);
		
		assertEquals(resEsperado,resObtenido);
	}
	
	/**
	 * pruebas
	 * @return
	 */
	private static Stream<Arguments> tests() {
		return Stream.of(
			Arguments.of(2,true),
			Arguments.of(3,true),
			Arguments.of(4,false),
			Arguments.of(5,true),
			Arguments.of(6,false),
			Arguments.of(7,true),
			Arguments.of(11,true),
			Arguments.of(101,true),
			Arguments.of(102,false)
		
		);
	}
		
//	@Test
//	void testEsPrimo() {
//
//		boolean res=Ejercicio4.esPrimo(3);
//		
//		
//		assertTrue(res);
//	}

}
