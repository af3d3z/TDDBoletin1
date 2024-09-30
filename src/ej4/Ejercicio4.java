package ej4;

public class Ejercicio4 {
	public static boolean comprobarPrimo(int numero) {
		boolean res = false;
		
		if(
				numero % 2 != 0 && numero % 3 != 0 &&
				numero % 5 != 0 && numero % 7 != 0 &&
				numero % 13 != 0
			) {
			res = true;
		}
		
		return res;
	}
}
