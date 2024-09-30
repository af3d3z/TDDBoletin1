package ej4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio4Test {

	@Test
	void testComprobarPrimoTestPrimo() {
		boolean resultado = Ejercicio4.comprobarPrimo(17);
		assertTrue(resultado);
	}
	
	@Test
	void testComprobarPrimoTestNoPrimo() {
		boolean resultado = Ejercicio4.comprobarPrimo(24);
		assertFalse(resultado);
	}

}
