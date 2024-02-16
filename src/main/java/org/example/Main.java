package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {


    static class InvalidFirstnameException extends Exception {
        InvalidFirstnameException(String Firstname) {
            super(Firstname);
        }
    }

    static class InvalidLastnameException extends Exception {
        InvalidLastnameException(String Lastname) {
            super(Lastname);
        }
    }

    static class InvalidemailException extends Exception {
        InvalidemailException(String email) {
            super(email);
        }
    }

    static class InvalidphoneException extends Exception {
        InvalidphoneException(String phone) {
            super(phone);
        }
    }

    static class InvalidpasswordException extends Exception {
        InvalidpasswordException(String password) {
            super(password);
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
            if (isvalidname(Firstname)) {
                System.out.println(Firstname + " (first name successfully registered ) ");
            } else {

                throw new InvalidFirstnameException(Firstname + " is invalid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {

            if (isvalidname(Lastname)) {
                System.out.println(Lastname + " ( Last name successfully registered ) ");
            } else {
                throw new InvalidLastnameException(Lastname + " is invalid ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            if (validemail(email)) {
                System.out.println(email + " (Email id registered ) ");
            } else {
                throw new InvalidemailException(email + " is invalid ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (validnumber(number)) {
                System.out.println(number + " ( phone number successfully registered ) ");
            } else {
                throw new InvalidphoneException(number + " is invalid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (validpassword(password)) {
                System.out.println(password + "  successfully registered ");
            } else {
                throw new InvalidpasswordException(password + " is invalid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean isvalidname(String name) {
        String regex = "^[A-Z][a-z]{2,}";
        return Pattern.matches(regex, name);

    }

    public static boolean validemail(String email) {
        String regex = "^[a-zA-Z0-9]+[/.]?[a-zA-z0-9]*[@][a-z]{2,5}[/.][a-z]{2,3}[/.]?[a-z]*$";
        return Pattern.matches(regex, email);
    }

    public static boolean validnumber(String number) {
        String regex = "^[0-9]{2} [0-9]{10}$";
        return Pattern.matches(regex, number);
    }

    public static boolean validpassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
        return Pattern.matches(regex, password);
    }


}