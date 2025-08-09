import br.edu.infnet.ScientificCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes da Calculadora Científica - DR3 - TP1")
public class ScientificCalculatorTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    @DisplayName("Deve somar dois números positivos")
    void testAddition() {
        double a = 5.0;
        double b = 3.0;
        double expectedResult = 8.0;

        double actualResult = calculator.add(a, b);

        assertEquals(expectedResult, actualResult);
    }

}
