import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTest {

    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
    ArrayList<Integer> listWithOne = new ArrayList<>(Arrays.asList(1));
    ArrayList<Integer> listWithMultiple = new ArrayList<Integer>(Arrays.asList(1,2,3,5,7));
    ArrayList<Integer> listNull = null;

    @Test
    public void sumlistWithOne() throws Exception {
        assertEquals(1, sum.getSum(listWithOne));
    }
    @Test
    public void sumlistWithMulitple() throws Exception {
        assertEquals(18,sum.getSum(listWithMultiple));
    }
    @Test
    public void sumlistNull() throws Exception {
        assertEquals(0,sum.getSum(listNull));
    }
}

