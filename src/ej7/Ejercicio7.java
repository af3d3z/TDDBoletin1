package ej7;

public class Ejercicio7 {
	public static boolean fechaCorrecta(int dia, int mes, int anio) {
		boolean res = false;
		if (dia >= 1 && dia <=31 && mes >= 1 && mes <= 12) {
			res=true;
		}
		return res;
	}
}
