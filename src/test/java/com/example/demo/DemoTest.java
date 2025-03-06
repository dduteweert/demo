package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class DemoTest {

    @Test
    public void firstTest() {
        assertEquals(1,1);
    }

    @Test
    public void secondTest() {
        assertNull(null);
    }

    @Test
    public void thirdTest() {
        assertEquals(1,2);
    }
}
