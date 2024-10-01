package ej7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;


class Ejercicio7Test {

	@ParameterizedTest
	@MethodSource("fechas")
	void testFechaCorrecta(int dia, int mes, int anio, boolean resEsperado) {
		boolean res = Ejercicio7.fechaCorrecta(dia, mes, anio);
		assertEquals(resEsperado, res);
	}
	
	public static Stream<Arguments> fechas () {
		return Stream.of(
				Arguments.of(0, 0, 0, false),
				Arguments.of(3, 5, 2006, true),
				Arguments.of(23, 9, 4000, true)
			);
	}

}
