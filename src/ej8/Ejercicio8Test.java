package ej8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio8Test {

	@ParameterizedTest //test con parametros
	@MethodSource("tests")
	void fibonacci(int num,int resEsperado) throws Exception {
		
		int res=Ejercicio8.fibonacci(num);
		
		//comprobamos los valores
		assertEquals(resEsperado,res);
		
	}
	
	//el method source de tests
	private static Stream<Arguments> tests(){
		return Stream.of(
				
				Arguments.of(1,1),
				Arguments.of(2,1),
				Arguments.of(3,2),
				Arguments.of(4,3),
				Arguments.of(5,5),
				Arguments.of(8,6),
				Arguments.of(13,7)
				
				
		);
		
	}

}
