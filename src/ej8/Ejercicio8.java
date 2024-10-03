package ej8;

public class Ejercicio8 {
	public static int fibonacci(int n) throws Exception {
		int res;
		int n1 = n - 1;
		int n2 = n - 2;
		
		if (n == 1 || n == 2) {
			res = 1;
		}else if(n < 1) {
			throw new Exception("No puede ser menor a 1.");
		}else {
			return fibonacci(n1) + fibonacci(n2);
		}
		
		return res;
	}
}
