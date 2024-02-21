package org.example;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Main {


    static class InvalidFirstnameException extends Exception {
        InvalidFirstnameException(String message) {
            super(message);
        }
    }

    static class InvalidLastnameException extends Exception {
        InvalidLastnameException(String message) {
            super(message);
        }
    }

    static class InvalidemailException extends Exception {
        InvalidemailException(String message) {
            super(message);
        }
    }

    static class InvalidphoneException extends Exception {
        InvalidphoneException(String message) {
            super(message);
        }
    }

    static class InvalidpasswordException extends Exception {
        InvalidpasswordException(String message) {
            super(message);
        }
    }


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name of user :");
        String Firstname = sc.next();

        System.out.println("Enter the last name of user :");
        String Lastname = sc.next();
        System.out.println("Enter Email id : ");
        String email = sc.next();
        sc.nextLine();
        System.out.println("Enter phone number along with country code ");
        String number = sc.nextLine();
        System.out.println("enter the password ");
        String password = sc.next();

        try {
            Predicate<String> pr = n -> n.matches("^[A-Z][a-z]{2,}$");
            if (pr.test(Firstname)) {

                System.out.println(Firstname + " (first name successfully registered ) ");
            } else {

                throw new InvalidFirstnameException(Firstname + " is invalid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Predicate<String> pr = n -> n.matches("^[A-Z][a-z]{2,}$");
            if (pr.test(Lastname)) {
                System.out.println(Lastname + " ( Last name successfully registered ) ");
            } else {
                throw new InvalidLastnameException(Lastname + " is invalid ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            Predicate<String> pr = n -> n.matches("^[a-zA-Z0-9]+[/.]?[a-zA-z0-9]*[@][a-z]{2,5}[/.][a-z]{2,3}[/.]?[a-z]*$");
            if (pr.test(email)) {
                System.out.println(email + " (Email id registered ) ");
            } else {
                throw new InvalidemailException(email + " is invalid ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Predicate<String> pr = n -> n.matches("^[0-9]{2} [0-9]{10}$");
            if (pr.test(number)) {
                System.out.println(number + " ( phone number successfully registered ) ");
            } else {
                throw new InvalidphoneException(number + " is invalid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Predicate<String> pr = n -> n.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$");
            if (pr.test(password)) {
                System.out.println(password + "  successfully registered ");
            } else {
                throw new InvalidpasswordException(password + " is invalid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}