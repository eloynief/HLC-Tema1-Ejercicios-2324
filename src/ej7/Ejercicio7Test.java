package ej7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio7Test {

	@ParameterizedTest //test con parametros
	@MethodSource("tests")
	void esFecha(int dia,int mes,int ano,boolean devolvido) {
		
		boolean res=Ejercicio7.esFecha(dia,mes,ano);
		
		
		assertEquals(devolvido,res);
		
	}
	
	
	private static Stream<Arguments> tests(){
		return Stream.of(
				
				Arguments.of(1,10,2000,true),
				Arguments.of(1,2,2000,true),
				Arguments.of(39,10,2000,false),
				Arguments.of(1,23,2000,false)
				
				
		);
		
	}
	
	
	

}
