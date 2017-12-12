import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeTest {

    @Test
    public void beginNumberWithExclude() {
        MyRange range = new MyRange();
        int result = range.getBegin("(1,5)");
        assertEquals(2, result);
    }

    @Test
    public void beginNumberWithInclude() {
        MyRange range = new MyRange();
        int result = range.getBegin("[1,5)");
        assertEquals(1, result);
    }

    @Test
    public void endWithExclude() {
        MyRange range = new MyRange();
        boolean result = range.endWithInclude("[1,5)");
        assertFalse(result);
    }

    @Test
    public void endWithInclude() {
        MyRange range = new MyRange();
        boolean result = range.endWithInclude("[1,5]");
        assertTrue(result);
    }

    @Test
    public void startWithExclude() {
        MyRange range = new MyRange();
        boolean result = range.startWithInclude("(1,5]");
        assertFalse(result);
    }

    @Test
    public void startWithInclude() {
        MyRange range = new MyRange();
        boolean result = range.startWithInclude("[1,5]");
        assertTrue(result);
    }

}
