package ej7;

public class Ejercicio7 {
	
	/*
	 * Primero hemos comprobado el dia mes y año si estan dentro de los valores
		if(compruebaDia&&compruebaMes&&compruebaAno) {
			res=true;
		}
	 */
	
	/**
	 * 
	 * @param dia
	 * @param mes
	 * @param ano
	 * @return
	 */
	public static boolean esFecha(int dia,int mes,int ano) {
		boolean res=false;
		boolean compruebaDia=dia>0&&dia<32;
		boolean compruebaMes=mes>0&&mes<13;
		boolean compruebaAno=ano>0;
		
		boolean compruebaBisiesto=(ano%4==0&&ano%100==0);
		
		
		
		
		if(compruebaDia&&compruebaMes&&compruebaAno) {
			res=true;
		}
		
		//compobamos que sea bisiesto
		if(dia==29&&mes==2&&compruebaBisiesto) {
			
		}
			
		return res;
	}
	
	
	
	
}
