package Examples;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testStringTest() {
        Main main = new Main();
        int res = main.stringTest();
        assertEquals(4, res);
    }
}