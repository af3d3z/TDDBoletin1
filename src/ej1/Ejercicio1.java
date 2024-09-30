package ej1;

public class Ejercicio1 {
	public static boolean esVocal(char caracter) {
		boolean result = false;
		char lowercase = Character.toLowerCase(caracter);
		
		switch(lowercase) {
		case 'a', 'e', 'i', 'o', 'u': {
			result = true;
			break;
			}
		}
		
		return result;
	}
}
