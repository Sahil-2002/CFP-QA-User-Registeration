package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of user :");
        String name = sc.next();

        if(isvalidfirstname(name)){
            System.out.println("name is correct "+name);
        }
        else{
            System.out.println("name is invalid ");
        }

    }
    public static boolean isvalidfirstname(String name){
        String regex = "^[A-Z][a-z]{2}";
        return Pattern.matches(regex,name);

    }

}