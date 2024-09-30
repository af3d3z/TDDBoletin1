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
	
	public Stream<Arguments> numeritos() {
		return Stream.of(
				Arguments.of(2, 3, 1, 5)
				);
	}

	@Test
	void testCalculadoraIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () ->  Ejercicio6.calculadora(2, 4, 0));
	}

}
