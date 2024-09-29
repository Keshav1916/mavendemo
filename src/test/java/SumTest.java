package com.sum.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumTest {

    @Test
    public void testAdd() {
        Sum sum = new Sum();
        assertEquals(100, sum.add(50, 50), "The sum of 50 and 50 should be 100");
    }

    @Test
    public void testAddNegativeNumbers() {
        Sum sum = new Sum();
        assertEquals(-10, sum.add(-5, -5), "The sum of -5 and -5 should be -10");
    }

    @Test
    public void testAddWithZero() {
        Sum sum = new Sum();
        assertEquals(50, sum.add(50, 0), "The sum of 50 and 0 should be 50");
    }
}
