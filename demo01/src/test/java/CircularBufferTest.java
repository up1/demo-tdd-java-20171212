import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CircularBufferTest {

    @Test
    public void เมื่อเพิ่มABเข้าไปและอ่านมาทั้งหมดต้องว่าง() {
        //Arrange
        CircularBuffer buffer = new CircularBuffer();
        buffer.write("A");
        buffer.write("B");
        buffer.read();
        buffer.read();
        //Assert
        assertTrue("Buffer มันไม่ว่าง", buffer.isEmpty());
    }

    @Test
    public void เมื่อเพิ่มABเข้าไปแล้วอ่านมาต้องเป็นAB() {
        //Arrange
        CircularBuffer buffer = new CircularBuffer();
        buffer.write("A");
        buffer.write("B");
        //Assert
        assertEquals("A", buffer.read());
        assertEquals("B", buffer.read());
    }

    @Test
    public void เมื่อเพิ่มBเข้าไปแล้วอ่านมาต้องเป็นB() {
        //Arrange
        CircularBuffer buffer = new CircularBuffer();
        buffer.write("B");
        //Act
        String actual = buffer.read();
        //Assert
        assertEquals("B", actual);
    }

    @Test
    public void เมื่อเพิ่มAเข้าไปแล้วอ่านมาต้องเป็นA() {
        //Arrange
        CircularBuffer buffer = new CircularBuffer();
        buffer.write("A");
        //Act
        String actual = buffer.read();
        //Assert
        assertEquals("A", actual);
    }

    @Test
    public void เมื่อสร้างbufferและเพิ่มAเข้าไปแล้วต้องไม่ว่าง() {
        //Arrange
        CircularBuffer buffer = new CircularBuffer();
        buffer.write("A");
        //Act
        boolean actual = buffer.isEmpty();
        //Assert
        assertFalse("Buffer มันว่าง", actual);
    }

    @Test
    public void เมื่อสร้างbufferแล้วต้องว่าง() {
        //Arrange
        CircularBuffer buffer = new CircularBuffer();
        //Act
        boolean actual = buffer.isEmpty();
        //Assert
        assertTrue("Buffer มันไม่ว่าง", actual);
    }

}
