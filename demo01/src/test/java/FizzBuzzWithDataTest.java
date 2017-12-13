import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class FizzBuzzWithDataTest {

    @Parameter
    public int input;
    @Parameter(1)
    public String expectedResult;

    @Parameters(name = "say({0}) => {1}")
    public static Collection<Object[]> xxx() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {3, "Fizz"},
        });
    }

    @Test
    public void xxxx() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expectedResult, fizzBuzz.say(input));
    }

}
