package ej3;

public class Ejercicio3 {
	/**
	 * función que dado un número devuelva una cadena
	 */
	public static String multiplos(int num) {
		String texto="";
		
		if (num%3==0) {
			texto+="fizz";
		}
		
		if (num%5==0) {
			texto+="buzz";
		}
		
		return texto;
	}
	
}
