package tarefa01lpooii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculaSalarioTest {

    @Test
    void calculaSalarioBruto() {
        assertEquals(2000, CalculaSalario.calculaSalarioBruto(50,40));
        assertThrows(RuntimeException.class, () -> CalculaSalario.calculaSalarioBruto(-50, 40));
    }

    @Test
    void calculaSalarioLiquido() {
        assertEquals(1800, CalculaSalario.calculaSalarioLiquido(2000, 10));
        assertThrows(RuntimeException.class, () -> CalculaSalario.calculaSalarioLiquido(2000, 110));
    }

}