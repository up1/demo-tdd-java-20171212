import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void saySame() {
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
        assertEquals("4", fizzBuzz.say(4));
        assertEquals("7", fizzBuzz.say(7));
        assertEquals("8", fizzBuzz.say(8));
    }

    @Test
    public void sayFizz() {
        assertEquals("Fizz", fizzBuzz.say(3));
        assertEquals("Fizz", fizzBuzz.say(6));
        assertEquals("Fizz", fizzBuzz.say(9));
    }

    @Test
    public void sayBuzz() {
        assertEquals("Buzz", fizzBuzz.say(5));
        assertEquals("Buzz", fizzBuzz.say(10));
    }

    @Test
    public void sayFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.say(15));
        assertEquals("FizzBuzz", fizzBuzz.say(30));
    }

}
