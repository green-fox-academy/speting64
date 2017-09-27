import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci match;

    @Before
    public void setUp() throws Exception{
        match = new Fibonacci();
    }
    @Test
    public void getNumber() throws Exception {
        assertEquals(match.getNumber(1),1);
    }
}