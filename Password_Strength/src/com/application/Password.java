package com.application;
import java.util.regex.*;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter Strong password..");
        String password = scan.next();
        if (isStrongPassword(password)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak. Please choose a stronger password.");
        }
        scan.close();
    }

    public static boolean isStrongPassword(String password) {
        // Check minimum length
        if (password.length() < 8) {
            return false;
        }

        // Check for at least one uppercase letter
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }

        // Check for at least one lowercase letter
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            return false;
        }

        // Check for at least one digit
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return false;
        }

        // Check for at least one special character
        if (!Pattern.compile("[!@#$%^&*()-+=]").matcher(password).find()) {
            return false;
        }

        // If all checks pass, the password is considered strong
        return true;
    }
}
