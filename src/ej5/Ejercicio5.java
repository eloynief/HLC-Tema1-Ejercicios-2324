package ej5;

public class Ejercicio5 {

	/* 
	 * comp 1: num=1
	 */
	
	/* 
	 * como el numero debe ser positivo, 
	 * entonces se comprueba si es positivo
	 * 
	 */
	
	//comp 2: num<10
	
	/*
	 * comp 3: 
	 * if(num<10) 
	 * elseif numeroLetra.charAt(0)==numeroLetra.charAt(1)
	*/
	/*
	 * como hay capicuos de mas de 2 cifras, 
	 * entonces se deben hacer otras comprobaciones
	 */
	/*
	 * despues de comprobar varias veces, he dado como resultado que
	 * hay que pasar a string, y luego comprobar cada numero
	 * 
	 */
	
	public static boolean esCapicuo(int num) {
		//si el numero es positivo, es true
		boolean res=num>=0;
		
		//separamos el string
		String[] numeroLetra;
		
		numeroLetra=Integer.toString(num).split("");
		
		
		
		if(num>10) {
			
			for(int i=0;i<numeroLetra.length-1;i++) {
				
				if(!numeroLetra[i].equals(numeroLetra[numeroLetra.length-1-i])) {
					
					res=false;
				}
				//tambien podria poner directamente res=!numeroLetra[i].equals(numeroLetra[numeroLetra.length-1-i]);
				
				
			}
			
		}
		
		
		
		return res;
		
	}
	
	
	
}
