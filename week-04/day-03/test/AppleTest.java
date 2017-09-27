import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    String appleType = "Starking";
    Apple thisApple;

    @Before
    public void setUp() throws Exception {
        thisApple= new Apple(appleType);
        System.out.println("It should run before the test");
    }
    @After
    public void disConnect() throws Exception {
        appleType = "Pepperoni";
        System.out.println("It should run after the test");
    }
    @Test
    public void getApple()throws Exception {
        assertEquals("Starking",thisApple.getApple());
    }
    @Test
    public void getApple2()throws Exception {
        assertTrue(appleType.equals(thisApple.getApple()));
    }
    @Test
    public void getApple3()throws Exception {
        assertFalse("Whopperito".equals(thisApple.getApple()));
    }
}