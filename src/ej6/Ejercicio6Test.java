package ej6;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio6Test {
	@ParameterizedTest
	@MethodSource("numeritos")
	void testCalculadoraNumeritos(int n1, int n2, int op, double expectedRes) {
		double res = Ejercicio6.calculadora(n1, n2, op);
		assertEquals(expectedRes, res);
	}
	
	public static Stream<Arguments> numeritos() {
		return Stream.of(
				Arguments.of(2, 3, 1, 5),
				Arguments.of(4, 2, 2, 2),
				Arguments.of(5, 5, 3, 25),
				Arguments.of(10, 5, 4, 2)
				);
	}

	@Test
	void testCalculadoraIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () ->  Ejercicio6.calculadora(2, 4, 0));
	}
	
	@Test
	void testCalculadoraArithmeticException() {
		assertThrows(ArithmeticException.class, () -> Ejercicio6.calculadora(3, 0, 4));
	}

}
