package ej8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio8Test {

	@ParameterizedTest
	@MethodSource("numeritos")
	void testFibonacci(int n, int resEsperado) throws Exception {
		int res = Ejercicio8.fibonacci(n);
		assertEquals(resEsperado, res);
	}
	
	
	public static Stream<Arguments> numeritos() {
		return Stream.of(
					Arguments.of(1, 1),
					Arguments.of(2, 1),
					Arguments.of(3, 2),
					Arguments.of(5, 5)
				);
	}
	
	@Test
	void testFibonacciException() throws Exception {
		assertThrows(Exception.class, () -> Ejercicio8.fibonacci(0), "No puede ser menor a 1.");
	}

}
