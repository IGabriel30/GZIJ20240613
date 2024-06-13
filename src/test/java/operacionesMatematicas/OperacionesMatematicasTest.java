package operacionesMatematicas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasTest {

    OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();

    @Test
    void testCalcularRaizCuadradaPositivo() {

        double numero = 16.0;
        double resultadoEsperado = 4.0;

        double resultado = operacionesMatematicas.calcularRaizCuadrada(numero);


        assertEquals(resultadoEsperado, resultado, 0.0001, "La raíz cuadrada de 4.0 debería ser 2.0");
    }
}