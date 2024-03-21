package Assignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment12 {

   public static boolean validPassword(String password) {     // This method checks if the password is valid
        if (password.length() < 8 || password.length() > 16){      // If the password is less than 8 or greater than 16 characters, it is invalid
            return false;
        }
        int count = 0;    // This variable counts the number of categories the password meets
        String[] categories = {    // This array contains the categories that the password must meet
            "[a-z]",       // This category checks if the password contains a lowercase letter
            "[A-Z]",       // This category checks if the password contains an uppercase letter
            "\\d",        // This category checks if the password contains a digit
            "[!@#$%^&*()_+{}|:<>?~]"         // This category checks if the password contains a special character
        };

        for (String category : categories) {      // This loop checks if the password meets the categories
            Pattern pattern = Pattern.compile(category);        // This line compiles the category into a pattern
            Matcher matcher = pattern.matcher(password);      // This line creates a matcher object that matches the pattern with the password
            if (matcher.find()) {       // If the pattern is found in the password, the count is incremented by 1
                count++;
            }
        }
        return count == 3 || count == 4;      // If the count is 3 or 4, the password is valid, otherwise it is invalid
   }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a password: ");
        scnr = new Scanner(System.in);
        String password = scnr.nextLine();
        scnr.close();
        if (validPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
        
    }
}