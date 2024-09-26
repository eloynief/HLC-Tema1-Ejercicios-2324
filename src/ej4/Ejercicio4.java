package ej4;

public class Ejercicio4 {

	/**
	 * funcion
	 */
	public static boolean esPrimo(int numero) {

		boolean res = (numero>1);

		int contador = 0;

//		for (int i = numero; i > 0; i--) {
//			if (numero % i == 0) {
//				contador++;
//			}
//		}
//
//		if (contador == 2) {
//			res = true;
//		}
		
		while(contador<=Math.sqrt(numero)&&res) {
			
			res=(numero%contador!=0);
			
			contador++;
		}
		
		

		return res;
	}

}
