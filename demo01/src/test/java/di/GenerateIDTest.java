package di;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class GenerateIDTest {

    @Test
    public void id_equal_5() {
        GenerateID generateID = new GenerateID();
        assertEquals(5, generateID.getId(new Random5()));
    }
}

class Random5 implements MyRandom {
    boolean called = false;
    public int nextInt(int bound) {
        called = true;
        return 5;
    }

    public boolean isCalled() {
        return called;
    }
}