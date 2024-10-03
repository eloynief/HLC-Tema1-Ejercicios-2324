package ej7;

public class Ejercicio7 {
	
	/*
	 * He creado 3 variables para comprobar el dia el es y el año
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
		
		boolean compruebaBisiesto=(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
		
		
		//(year%4==0&&year%100==0);
		
		
		//cambiar esto a un switch case en funcion del mes porque algunos meses tienen 31 dias y otros 30. febrero tiene 28
		
		
		if(compruebaDia&&compruebaMes&&compruebaAno) {
			res=true;
		}
		
		//compobamos que sea bisiesto
		if(dia==29&&mes==2&&compruebaBisiesto) {
			
			res=true;
			
		}
			
		//comprobamos que los dias en ciertos meses no supere 30 o que no supere 28 en febrero
		
		
		
		return res;
	}
	
	
	
	
}
