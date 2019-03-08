package count;

import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void checkPrint3() {
        assertEquals("Fizz", Counter.getString(3));
        assertEquals("Fizz", Counter.getString(63));
        assertEquals("Fizz", Counter.getString(99));
        assertEquals("Buzz", Counter.getString(5));
        assertEquals("Buzz", Counter.getString(55));
        assertEquals("Buzz", Counter.getString(100));
        assertEquals("FizzBuzz",Counter.getString(15));
        assertEquals("FizzBuzz",Counter.getString(60));
        assertEquals("FizzBuzz",Counter.getString(75));
        assertEquals("1",Counter.getString(1));
        assertEquals("41",Counter.getString(41));
        assertEquals("98",Counter.getString(98));
    }


}