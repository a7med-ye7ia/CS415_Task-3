import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTesting {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.add(2,3));
    }

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.sub(8,4));
    }

    @Test
    public void testMul(){
        Calculator calculator = new Calculator();
        assertEquals(25,calculator.mul(5,5));
    }

    @Test
    public void testDiv(){
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.div(30,3));
    }

    @Test
    public void testMod(){
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.mod(30,3));
    }

    @Test
    public void testPow(){
        Calculator calculator = new Calculator();
        assertEquals(144 ,calculator.pow(12,2));
    }

    @Test
    public void testSqrt(){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.sqrt(4) , 1e-9);
    }

}
