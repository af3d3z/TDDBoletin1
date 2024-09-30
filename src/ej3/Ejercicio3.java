package ej3;

public class Ejercicio3 {
	public static String devolverCadena(int numero) {
		String cadena = "";
		
		if (numero % 3 == 0 && numero % 5 == 0) {
			cadena = "fizzbuzz";
		}else if(numero % 3 == 0) {
			cadena = "fizz";
		}else if (numero % 5 == 0) {
			cadena = "buzz";
		}
		
		return cadena;
	}
}
