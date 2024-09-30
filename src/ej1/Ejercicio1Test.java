package ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio1Test {
	
	@ParameterizedTest 
	@MethodSource("vocales")
	void testEsVocal(char caracter, boolean resObtenido) {
		boolean resEsperado = Ejercicio1.esVocal(caracter);
		assertEquals(resEsperado, resObtenido);
	}
	
	public static Stream<Arguments> vocales() {
		return Stream.of(
				Arguments.of('a', true),
				Arguments.of('E', true),
				Arguments.of('i', true),
				Arguments.of('O', true),
				Arguments.of('u', true),
				Arguments.of('D', false)
				);
	}
/*
	@Test
	void testEsVocalAMinuscula() {
		boolean resul = Ejercicio1.esVocal('a');
		assertTrue(resul);
	}
	
	@Test
	void testEsVocalAMayuscula() {
		boolean resul = Ejercicio1.esVocal('A');
		assertTrue(resul);
	}
	
	@Test
	void testEsVocalEMinuscula() {
		boolean resul = Ejercicio1.esVocal('e');
		assertTrue(resul);
	}
	
	@Test
	void testEsVocalEMayuscula() {
		boolean resul = Ejercicio1.esVocal('E');
		assertTrue(resul);
	}
	
	@Test
	void testEsVocalIMinuscula() {
		boolean resul = Ejercicio1.esVocal('i');
		assertTrue(resul);
	}
	
	@Test
	void testEsVocalIMayuscula() {
		boolean resul = Ejercicio1.esVocal('I');
		assertTrue(resul);
	}
	
	@Test
	void testEsVocalOMinuscula() {
		boolean resul = Ejercicio1.esVocal('o');
		assertTrue(resul);
	}
	
	@Test
	void testEsVocalOMayuscula() {
		boolean resul = Ejercicio1.esVocal('O');
		assertTrue(resul);
	}
	
	@Test
	void testEsVocalConsonante() {
		boolean resul = Ejercicio1.esVocal('D');
		assertFalse(resul);
	}
	*/

}
