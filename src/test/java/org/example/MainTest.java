package org.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
class MainTest {
    @Test
    public void checknametrue() {
        String name = "Joh";
        Predicate<String> pr = n -> n.matches("^[A-Z][a-z]{2,}$");
        assertTrue(pr.test(name));

    }

    @Test
    public void checknamefalse() {
        String name = "sahil";
        Predicate<String> pr = n -> n.matches("^[A-Z][a-z]{2,}$");
        pr.test(name);
        assertFalse(pr.test(name));
    }

    @Test

    public void checkemail() {

        Predicate<String> pr = n -> n.matches("^[a-zA-Z0-9]+[/.]?[a-zA-z0-9]*[@][a-z]{2,5}[/.][a-z]{2,3}[/.]?[a-z]*$");
        assertTrue(pr.test("Sahil@gmail.com"));
        assertTrue(pr.test("Sahilkhandekar@co.in"));
        assertFalse(pr.test("Sahil@gmailcom"));


    }

    @Test
    public void checknumber() {
        Predicate<String> pr = n -> n.matches("^[0-9]{2} [0-9]{10}$");
        assertTrue(pr.test("91 9082164605"));
        assertFalse(pr.test("9082164605"));
    }

    @Test
    public void checkpassword() {
        Predicate<String> pr = n -> n.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$");
        assertTrue(pr.test("saHil@171819"));
        assertFalse(pr.test("sahil"));

    }
}