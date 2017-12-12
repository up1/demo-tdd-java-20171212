import org.junit.*;

import static org.junit.Assert.*;

public class CircularBufferTest {

    CircularBuffer buffer = new CircularBuffer();


    @Test(expected = MyBufferOverflowException.class)
    public void error() {
        buffer.xxx();
    }


    @Before
    public void xxxx() {
        System.out.println("Before");
    }

    @After
    public void yyyy() {
        System.out.println("After");
    }

    @BeforeClass
    public static void a() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void b() {
        System.out.println("AfterClass");
    }


    @Test
    public void เมื่อเพิ่มABเข้าไปและอ่านมาทั้งหมดต้องว่าง() {
        //Arrange
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
        buffer.write("A");
        buffer.write("B");
        //Assert
        assertEquals("A", buffer.read());
        assertEquals("B", buffer.read());
    }

    @Test
    public void เมื่อเพิ่มBเข้าไปแล้วอ่านมาต้องเป็นB() {
        //Arrange
        buffer.write("B");
        //Act
        String actual = buffer.read();
        //Assert
        assertEquals("B", actual);
    }

    @Test
    public void เมื่อเพิ่มAเข้าไปแล้วอ่านมาต้องเป็นA() {
        //Arrange
        buffer.write("A");
        //Act
        String actual = buffer.read();
        //Assert
        assertEquals("A", actual);
    }

    @Test
    public void เมื่อสร้างbufferและเพิ่มAเข้าไปแล้วต้องไม่ว่าง() {
        //Arrange
        buffer.write("A");
        //Act
        boolean actual = buffer.isEmpty();
        //Assert
        assertFalse("Buffer มันว่าง", actual);
    }

    @Test
    public void เมื่อสร้างbufferแล้วต้องว่าง() {
        //Arrange
        //Act
        boolean actual = buffer.isEmpty();
        //Assert
        assertTrue("Buffer มันไม่ว่าง", actual);
    }

}
