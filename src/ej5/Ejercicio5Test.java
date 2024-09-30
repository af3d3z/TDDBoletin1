package ej5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio5Test {

	@ParameterizedTest
	@MethodSource("numeros")
	void esCapicuaTest(int numero, boolean resEsperado) {
		boolean res = Ejercicio5.esCapicua(numero);
		assertEquals(resEsperado, res);
	}
	
	
	public static Stream<Arguments> numeros() {
		return Stream.of(
				Arguments.of(2, true),
				Arguments.of(24, false),
				Arguments.of(44, true),
				Arguments.of(343, true));
	}

}
