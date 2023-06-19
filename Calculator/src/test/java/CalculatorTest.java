import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(4.0, 5.0);}

    @Test
    public void addIntegers(){
        assertEquals(9, calculator.addIntegers(),0);
    }

    @Test
    public void subtractIntegers(){
        assertEquals(-1, calculator.subtractIntegers(),0);
    }

    @Test
    public void multiplyIntegers(){
        assertEquals(20, calculator.multiplyIntegers(),0);
    }

    @Test
    public void divideNumbers(){
//        Calculator divideScenario = new Calculator(4.0, 5.0);
        assertEquals(0.8, calculator.divideNumbers(),0);
    }
}
