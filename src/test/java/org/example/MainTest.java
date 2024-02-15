package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void checknametrue() {
        String name = "Joh";
        assertTrue(Main.isvalidname(name));

    }

    @Test
    public void checknamefalse() {
        String name = "Sahil";
        assertFalse(Main.isvalidname(name));
    }

}