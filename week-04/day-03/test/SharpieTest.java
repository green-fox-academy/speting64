import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    Sharpie color = new Sharpie("Blue", (float)61.56);
    float ink = color.inkAmount - color.width;

    @Test
    public void use() throws Exception{

        color.use();
        assertEquals(38 , (int)color.inkAmount );
    }
}