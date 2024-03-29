package calculator;
import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calc = new Calculator();

    @Test
    public void squarerootTruePositive()
    {
        assertEquals ("Square root of an Int - True Positive", 3, calc.SquareRoot(9), DELTA);
        assertEquals ("Square root of an Int - True Positive", 5, calc.SquareRoot(25), DELTA);
    }

    @Test
    public void squarerootFalsePositive()
    {
        assertNotEquals ("Square root of an Int - False Positive", 3, calc.SquareRoot(7), DELTA);
        assertNotEquals ("Square root of an Int - False Positive", 5, calc.SquareRoot(49), DELTA);
    }

    @Test
    public void factorialTruePositive()
    {
        assertEquals ("factorial of an Int - True Positive", 6, calc.factorial(3), DELTA);
        assertEquals ("factorial of an Int - True Positive", 120, calc.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive()
    {
        assertNotEquals ("factorial of an Int - False Positive", 0, calc.factorial(0), DELTA);
        assertNotEquals ("factorial of an Int - False Positive", 12, calc.factorial(4), DELTA);
    }

    @Test
    public void logTruePositive()
    {
        assertEquals ("log of an Int - True Positive", 0, calc.log(1), DELTA);
        assertEquals ("log of an Int - True Positive", 2.302585092994046, calc.log(10), DELTA);
    }

    @Test
    public void logFalsePositive()
    {
        assertNotEquals ("log of an Int - false Positive", 0, calc.log(2), DELTA);
        assertNotEquals ("log of an Int - false Positive", 12, calc.log(4), DELTA);
    }

    @Test
    public void powerTruePositive()
    {
        assertEquals ("power of an Int - True Positive", 0, calc.power(0, 1), DELTA);
        assertEquals ("power of an Int - True Positive", 1000, calc.power(10, 3), DELTA);
    }

    @Test
    public void powerFalsePositive()
    {
        assertNotEquals ("power of an Int - False Positive", 0, calc.power(2, 0), DELTA);
        assertNotEquals ("power of an Int - False Positive", 12, calc.power(4, 3), DELTA);
    }
}