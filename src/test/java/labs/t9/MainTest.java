package labs.t9;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testFirstTask() {
        Main main = new Main();
        String result = main.firstTask(1, 2, 3, 4);
        Assert.assertEquals("Гиппотенуза 2 - больше", result);
    }

    @Test
    public void testSecondTask() {
        Main main = new Main();
        String result = main.secondTask("aasd zgfdgdf xjhj fdasd gdw hxx jcc qrv");
        Assert.assertEquals("aasd fdasd gdw hxx jcc qrv xjhj zgfdgdf", result);
    }
}