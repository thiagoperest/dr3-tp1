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

    @Test
    @DisplayName("Deve subtrair dois números corretamente")
    void testSubtract() {
        // Setup
        // Prepara os dados de entrada e resultado esperado
        double a = 10.0;
        double b = 4.0;
        double expectedResult = 6.0;

        // Execution
        // Executa o método que está sendo testado
        double actualResult = calculator.subtract(a, b);

        // Assertion
        // Verifica se o resultado está correto
        assertEquals(expectedResult, actualResult);

        // Teardown
        // Neste teste, não há recursos externos para limpar
    }

    @Test
    @DisplayName("Deve multiplicar dois números corretamente")
    void testMultiply() {
        double a = 6.0;
        double b = 7.0;
        double expectedResult = 42.0;

        double actualResult = calculator.multiply(a, b);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Deve calcular a raiz quadrada de um número positivo")
    void testSquareRootPositive() {
        double a = 25.0;
        double expectedResult = 5.0;

        double actualResult = calculator.squareRoot(a);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Deve lançar exceção ao calcular raiz quadrada de número negativo")
    void testSquareRootNegative() {
        double negativeNumber = -30.0;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(negativeNumber);
        });

        assertEquals("Negative number", exception.getMessage());
    }

    @Test
    @DisplayName("Deve lançar exceção ao dividir por zero")
    void testDivideByZero() {
        double dividend = 10.0;
        double divisor = 0.0;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(dividend, divisor);
        });

        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Deve calcular logaritmo de números positivos")
    void testLog() {
        double value = Math.E;
        double expectedResult = 1.0;

        double actualResult = calculator.log(value);

        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    @DisplayName("Deve calcular seno de ângulos em graus")
    void testSin() {
        double degrees = 30.0;
        double expectedResult = 0.5;

        double actualResult = calculator.sin(degrees);

        assertEquals(expectedResult, actualResult, 0.001);
    }

}
