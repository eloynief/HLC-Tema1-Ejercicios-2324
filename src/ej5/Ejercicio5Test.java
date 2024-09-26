package ej5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Ejercicio5Test {



	//funciones y metodos
	
	@ParameterizedTest //test con parametros
	@MethodSource("tests")
	void esPrimo(int num, boolean resEsperado) {
		
		boolean resObtenido= Ejercicio5.esCapicuo(num);
		
		assertEquals(resEsperado,resObtenido);
	}
	
	/**
	 * pruebas
	 * @return
	 */
	private static Stream<Arguments> tests() {
		return Stream.of(
			Arguments.of(1,true),
			Arguments.of(-10,false),
			Arguments.of(11,true),
			Arguments.of(101,true),
			Arguments.of(102,false),
			Arguments.of(1331,true),
			Arguments.of(1321,false),
			Arguments.of(13231,true)
			
		);
	}
	
	
}
