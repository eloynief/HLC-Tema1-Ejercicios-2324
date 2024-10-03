package ej9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Ejercicio9Test {


	@ParameterizedTest //test con parametros
	@MethodSource("testBinario")
	void fibonacci(int num,int resEsperado) throws Exception {
		
		int res=Ejercicio9.numBinario(num);
		
		//comprobamos los valores
		assertEquals(resEsperado,res);
		
	}
	
	//el method source de tests
	private static Stream<Arguments> testBinario(){
		return Stream.of(
				
				Arguments.of(1,1),
				Arguments.of(2,10),
				Arguments.of(3,11)
				
				
		);
		
	}
}
