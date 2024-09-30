package ej3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

class Ejercicio3Test {

	@Test
	public void devolverCadenaTestMult3() {
		String resultado = Ejercicio3.devolverCadena(3);
		boolean resEsperado = resultado.equals("fizz");
		assertTrue(resEsperado);
	}

	@Test
	public void devolverCadenaTestMult5() {
		String resultado = Ejercicio3.devolverCadena(5);
		boolean resEsperado = resultado.equals("buzz");
		assertTrue(resEsperado);
	}
	
	@Test
	public void devolverCadenaTestMult3y5() {
		String resultado = Ejercicio3.devolverCadena(15);
		boolean resEsperado = resultado.equals("fizzbuzz");
		assertTrue(resEsperado);
	}
	
	@Test
	public void devolverCadenaTestNoMult() {
		String resultado = Ejercicio3.devolverCadena(16);
		boolean resEsperado = resultado.equals("");
		assertTrue(resEsperado);
	}
	
}
