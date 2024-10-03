package ej8;

public class Ejercicio8 {
	
	/**
	 * 
	 * @return el numero de fibonacci
	 * @throws Exception 
	 */
	public static int fibonacci(int numero) throws Exception {
		int res=1;
		
		int aux1=1;
		
		int aux2=1;
		
		
		if(numero<1) {
			throw new Exception("El numero no puede ser menor que 1");
		}
		
		//compruebo si el numero es mayor de 2
		if(numero>2) {

			//luego despues hacemos el bucle for
			for (int i =3;i<=numero;i++) {

				res=aux1+aux2;

				aux1=aux2;

				aux2=res;
				
			}
			
		}
		
		
		
		return res;
	}
	
	
	
}
