package com.sum.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumTest {

    @Test
    public void testAdd() {
        Sum sum = new Sum();
        assertEquals(100, sum.add(50, 50), "The sum of 50 and 50 should be 100");
    }
}
