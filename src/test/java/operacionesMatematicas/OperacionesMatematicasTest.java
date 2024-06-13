package operacionesMatematicas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasTest {

    OperacionesMatematicas operacionesMatematicas;
    @BeforeEach
    void setUp() {
        operacionesMatematicas = new OperacionesMatematicas();
    }

    @AfterEach
    void tearDown() {
        operacionesMatematicas = null;
    }

    @BeforeEach
    void setUpAllTest() {
        System.out.println("Iniciar todas las pruebas");
    }

    @AfterEach
    void alFinalizarTodasLasPruebas() {
        System.out.println("Finalizaron todas las pruebas");
    }

    @Test
    void testCalcularRaizCuadradaPositivo() {

        double numero = 16.0;
        double resultadoEsperado = 4.0;

        double resultado = operacionesMatematicas.calcularRaizCuadrada(numero);


        assertEquals(resultadoEsperado, resultado, 0.0001, "La raíz cuadrada de 16.0 debería ser 4.0");
    }



    @Test
    void testCalcularRaizCuadradaCero() {
        double numero = 0.0;
        double resultadoEsperado = 0.0;


        double resultado = operacionesMatematicas.calcularRaizCuadrada(numero);
        assertEquals(resultadoEsperado, resultado, 0.0001, "La raíz cuadrada de 0 debería ser 0");
    }

    @Test
    void testCalcularRaizCuadradaNegativo() {
        double numero = -4.0;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            operacionesMatematicas.calcularRaizCuadrada(numero);
        });
        assertEquals("El número no puede ser negativo", exception.getMessage(), "M Error ");
    }
}