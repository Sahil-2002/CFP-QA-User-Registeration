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
    @Test
    public void checkemail(){
        assertTrue(Main.validemail("Sahila.khandekar@gmail.com"));
        assertTrue(Main.validemail("abc.xyz@bl.co.in"));
        assertFalse(Main.validemail("sahil@gmail"));

    }
    @Test
    public void checknumber(){
        assertTrue(Main.validnumber("91 9082164605"));
        assertFalse(Main.validnumber("9082164605"));
    }
@Test
    public void checkpassword(){
        assertTrue(Main.validpassword("Sahil@khandekar17"));
        assertFalse(Main.validpassword("Sahil"));
}

}