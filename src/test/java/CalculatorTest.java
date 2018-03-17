import static org.junit.Assert.*;

/**
 * Created by Анна on 17.03.2018.
 */
public class CalculatorTest {
    @org.junit.Test
    public void calc() throws Exception {
        Calculator c = new Calculator();
        int actual = c.calc(1, 2, '+');
        int expected = 3;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void calc2() throws Exception {
        Calculator c = new Calculator();
        int actual = c.calc(1, 2, '-');
        int expected = -1;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void calc3() throws Exception {
        Calculator c = new Calculator();
        int actual = c.calc(4, 2, '*');
        int expected = 8;
        assertEquals(actual, expected);
    }

}