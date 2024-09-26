package ej6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio6Test {

	//funciones y metodos
	
	@ParameterizedTest //test con parametros
	@MethodSource("tests")
	void calculadora(double num1, double num2, int opcion, double resEsperado,boolean comprobacion) {
		
		double resObtenido= Ejercicio6.calculadora(num1, num2, opcion);
		boolean comprobar;
		
		
		assertEquals(resEsperado,resObtenido);
		
	}
	
	/**
	 * pruebas
	 * @return
	 */
	private static Stream<Arguments> tests() {
		return Stream.of(

			//casos true
			Arguments.of(1,2,1,3,true),
			Arguments.of(2,1,2,1,true),
			Arguments.of(1,2,3,2,true),
			Arguments.of(2,2,4,1,true),
			
			//casos false
			Arguments.of(1,2,1,4,false)
			
			
			
		);
	}

}
