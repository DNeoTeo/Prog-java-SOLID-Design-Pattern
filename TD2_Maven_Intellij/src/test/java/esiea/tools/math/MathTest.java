package esiea.tools.math;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void testAddIntInt() {
        assertEquals(Math.add(0, 1), 1);
        assertEquals(Math.add(-6, 6), 0);
    }
    @Test
    void testAddDoubleDouble(){
        assertEquals(Math.add(1.1, 5.6), 6.7,0.1);
        assertEquals(Math.add(-6.66, 6.66), 0,0.1);
    }
    @Test
    void testSubtractIntInt () {
        assertEquals(Math.subtract(0,1), -1);
        assertEquals(Math.subtract(1,1), 0);
    }

    @Test
    void testSubtractDoubleDouble() {
        assertEquals(Math.subtract(0.1,1.2), -1.1, 0.1);
        assertEquals(Math.subtract(1.66,1.66), 0, 0.1);
    }

    @Test
    void testMultiplyIntInt() {
        assertEquals(Math.multiply(4,2), 8);
        assertEquals(Math.multiply(0,1), 0);
    }

    @Test
    void testMultiplyDoubleDouble() {
        assertEquals(Math.multiply(0.1,1.1), 0.11, 0.1);
        assertEquals(Math.multiply(0.5, 4.4), 2.2, 0.1);
    }

    @Test
    void testDivideIntInt(){
        assertEquals(Math.divide(0,1), 0);
        assertEquals(Math.divide(10, 5), 2);
        try {
            assertEquals(Math.divide(16,0), 0);
        } catch (Exception e) {
            assertEquals("Cannot divide by zero (0).", e.getMessage());
        }
    }

    @Test
    void testDivideDoubleDouble(){
        assertEquals(Math.divide(0.8,0.2), 4, 0.1);
        assertEquals(Math.divide(1.1,1.1), 1, 0.1);
        try {
            assertEquals(Math.divide(1.6,0), 0);
        } catch (Exception e) {
            assertEquals("Cannot divide by zero (0).", e.getMessage());
        }
    }
}

