import org.junit.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AnagramTest {
    @Test
    public void testSimpleAnagram() {
        Anagram found = new Anagram("ant");
        List<String> anagram = found.match(Arrays.asList("tan", "stand", "at"));
        assertTrue(anagram.contains("tan"));
    }
}