import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ExtensionTest {

    Extension extension = new Extension();

    @Test
    public void testAdd_2and3is5() {
        assertEquals(6, extension.add(3, 3));
    }

    @Test
    public void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(30, extension.maxOfThree(11, 19, 30));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    public void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
    }

    @Test
   public void testMedian_five() {
        assertEquals(7, extension.median(Arrays.asList(1,2,3,4,5,10,14,20)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_o() {
        assertTrue(extension.isVowel('o'));
    }
/*
    @Test
    public void testIsVowel_o() {
        assertTrue(extension.isVowel('o'));
    }

    @Test
    public void testIsVowel_e() {
        assertTrue(extension.isVowel('e'));
    }

    @Test
    public void testIsVowel_i() {
        assertTrue(extension.isVowel('i'));
    }
*/
   /* @Test
    public void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }*/

    @Test
    void testTranslate_kolbice() {
        assertEquals("avapeve", extension.translate("ape"));
    }

    /*@Test
    public void testTranslate_whopper(){
        assertEquals("avape", extension.translate("ape"));
    }*/

}