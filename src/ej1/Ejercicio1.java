package ej1;

public class Ejercicio1 {
	/**
	 * 
	 * @param caracter
	 * @return el booleano
	 */
	public static boolean esVocal(char caracter) {
		//boolean res= Character.toLowerCase(caracter)=='a' && Character.toLowerCase(caracter)=='e';
		boolean res=false;
		char characterToMinus=Character.toLowerCase(caracter);
		
		switch (characterToMinus) {
		case 'a','e','i','o','u': res=true;
		}
		
		return res;
	}
	
}
