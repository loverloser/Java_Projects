package labs.t9;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testFirstTask() {
        Main main = new Main();
        String result = main.firstTask(1, 2, 3, 4);
        assertEquals("Гиппотенуза 2 - больше", result);
    }
}