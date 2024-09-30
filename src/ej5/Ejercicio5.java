package ej5;

public class Ejercicio5 {
	public static boolean esCapicua(int numero) {
		// almacenará el número invertido
		int espejo = 0;
		// es el mismo número introducido en la función pero como lo vamos a modificar hacemos una copia
		int copia = numero;
		
		/*
		 * se itera hasta que copia llegue a 0 y 
		 * en cada iteración le añadimos una cifra(la multiplicación por 10)
		 * y el número correspondiente a esa cifra (el módulo de copia)
		 * */
		while(copia > 0) {
			espejo *= 10;
			espejo += copia % 10;
			copia /= 10;
		}
		
		System.out.println(espejo);
		
		return espejo == numero;
	}
}
