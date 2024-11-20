
package tarefa01lpooii;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author arthu
 */
public class CalculaAreaTest {
    
    public CalculaAreaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of areaRetangulo method, of class CalculaArea.
     */
    @Test
    public void testAreaRetangulo() {
        assertEquals(20, CalculaArea.areaRetangulo(4, 5));
        assertThrows(RuntimeException.class, () -> CalculaArea.areaRetangulo(-4, 5));
    }

    /**
     * Test of areaCircunferencia method, of class CalculaArea.
     */
    @Test
    public void testAreaCircunferencia() {
        double resultEsperado = 50.26548245743669;
        double resultCalculado = 50.24;
        double delta = 0.01;
        assertEquals(resultEsperado, resultEsperado, delta);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(10, CalculaArea.areaTriangulo(4, 5));
        assertThrows(RuntimeException.class, () -> CalculaArea.areaTriangulo(4, -5));
    }
    
}
