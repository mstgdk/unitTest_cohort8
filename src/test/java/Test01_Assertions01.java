import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test01_Assertions01 {
    @Test
    public void test(){

    }
    @Test
    void testLength(){
        String str = "Merhaba Dünya";
        int actual = str.length();
        int expected = 13;

        assertEquals(expected,actual);
    }
    @Test
    void testContains(){
      assertEquals(true, "patika".contains("p"));
    }
    //@Test
    @RepeatedTest(5)
    void testNotEquals(){
        String actual = "hello";
        String expected = "HELLO";

        assertNotEquals(actual,expected);

    }
    @Test
    void testTrue(){
        int a = 15;
        int b = 12;

        assertTrue(a>b);
    }
    @Test
    void testFalse(){
        int a = 15;
        int b = 16;

        assertFalse(a>b);
    }

}
