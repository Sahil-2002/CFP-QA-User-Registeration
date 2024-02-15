package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name of user :");
        String Firstname = sc.next();
        System.out.println("Enter the last name of user :");
        String Lastname = sc.next();
        if (isvalidname(Firstname)) {
            System.out.println("First name is correct " + Firstname);
        } else {
            System.out.println("First name is invalid ");
        }
        if (isvalidname(Lastname)) {
            System.out.println("Last name is correct " + Lastname);
        } else {
            System.out.println("Last name is invalid ");
        }

    }

    public static boolean isvalidname(String name) {
        String regex = "^[A-Z][a-z]{2}";
        return Pattern.matches(regex, name);

    }


}