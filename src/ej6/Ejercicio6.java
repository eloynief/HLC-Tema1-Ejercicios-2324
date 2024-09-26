package ej6;

public class Ejercicio6 {
	
	//primero compruebo la suma haciendo el caso de las operaciones
	//debere comprobar que la opcion este dentro de las operaciones
	//
	
	/**
	 * funcion para calcular los numeros
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double calculadora(double num1, double num2, int opcion) {
		double res=0;
		
		//para las opciones
		switch(opcion) {
		
		case 1 -> res=num1+num2;
		case 2 -> res=num1-num2;
		case 3 -> res=num1*num2;
		case 4 -> res=num1/num2;


		}
		
		
		return res;
	}
	
	
	
	
	
	
}
