package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());

        int shouleReturn_3 = baseDemo.sum(1, 2);
        System.out.println("TEST ONE : 1 + 2 = " + shouleReturn_3);

        int shouldReturnMinus_4 = baseDemo.sum(-1,-3);

        System.out.println("TEST TWO -1 + (-4) = " + shouldReturnMinus_4);
    }
}
