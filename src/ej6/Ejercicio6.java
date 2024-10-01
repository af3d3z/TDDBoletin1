package ej6;

public class Ejercicio6 {
	public static double calculadora(int num1, int num2, int modo) {
		double res = switch(modo) {
			case 1 -> num1+num2;
			case 2 -> num1-num2;
			case 3 -> num1*num2;
			case 4 -> num1/num2;
		default -> throw new IllegalArgumentException("Unexpected value: " + modo); 
		};
		
		return res;
	}
}
