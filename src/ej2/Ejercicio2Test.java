package ej2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	public void comprobarParTestPar() {
		boolean res = Ejercicio2.comprobarPar(2);
		assertTrue(res);
	}
	
	@Test
	public void comprobarParTestImpar() {
		boolean res = Ejercicio2.comprobarPar(1);
		assertFalse(res);
	}
	
}
