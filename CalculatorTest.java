import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    @Test
    public void AddCheck()
    {
        System.out.println("Calculator: Addition Check");
        
        int a=3;
        int b=5;
        
        int expectedResult=8;
        
        Calculator calculator = new Calculator();
        
        int calculatedResult=calculator.add(a,b);
        assertEquals(calculatedResult, expectedResult);
    }
}