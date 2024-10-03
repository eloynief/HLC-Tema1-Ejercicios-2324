package ej9;

public class Ejercicio9 {
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static int numBinario(int num) {
		int binario=0;
	    int place = 1; // This will track the place value in the binary number

	    
        int remainder;
	    
	    
	    // Continua hasta que el numero sea 0
	    while (num > 0) {
	    	remainder= num % 2;
	        binario += remainder * place;
	        num /= 2;
	        place *= 10;
	    }
		
		
		
		
		//se devuelve el binario
		return binario;
	}
	
	
	
}
