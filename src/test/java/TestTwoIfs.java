import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestTwoIfs {

    @Test
    public void testAIsTrueAndBIsTrue() {

        TwoIfs m = new TwoIfs();
        int result = m.doSomething(true, true);

        assertEquals(3, result);
    }
    @Test
    public void testAIsFalseAndBIsFalse() {

        TwoIfs m = new TwoIfs();
        int result = m.doSomething(false, false);

        assertEquals(-3, result);
    }
}
