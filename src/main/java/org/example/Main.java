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
        System.out.println("Enter Email id : ");
        String email = sc.next();
        sc.nextLine();
        System.out.println("Enter phone number along with country code ");
        String number = sc.nextLine();
        System.out.println("enter the password ");
        String password = sc.next();

        if (isvalidname(Firstname)) {
            System.out.println(Firstname+" successfully registered ");
        } else {
            System.out.println("First name is invalid ");
        }
        if (isvalidname(Lastname)) {
            System.out.println(Lastname+ " successfully registered ");
        } else {
            System.out.println("Last name is invalid ");
        }
        if(validemail(email)){
            System.out.println(email+ " Email id registered  ");
        }
        else {
            System.out.println("Email is invalid ");
        }
        if(validnumber(number)){
            System.out.println(number+"  successfully registered ");
        }
        else {
            System.out.println("Enter phone number in proper format 10 digits number with country code ");
        }
        if(validpassword(password)){
            System.out.println("Password successfully registered ");
        }
        else {
            System.out.println("Password is not following standard rules  ");
        }

    }

    public static boolean isvalidname(String name) {
        String regex = "^[A-Z][a-z]{2}";
        return Pattern.matches(regex, name);

    }
    public static boolean validemail(String email){
        String regex = "^[a-zA-Z0-9]+[/.]?[a-zA-z0-9]*[@][a-z]{2,5}[/.][a-z]{2,3}[/.]?[a-z]*$";
        return Pattern.matches(regex,email);
    }
    public static boolean validnumber(String number){
        String regex = "^[0-9]{2} [0-9]{10}$";
        return Pattern.matches(regex, number);
    }
    public static boolean validpassword(String password){
        String regex = "^(?=.*[A-Z]).(?=.*[0-9]).{8,}$";
        return Pattern.matches(regex,password);
    }


}