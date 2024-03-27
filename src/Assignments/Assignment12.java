package Assignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment12 {

   public static boolean validPassword(String password) {     // This method checks if the password is valid
        if (password.length() < 8 || password.length() > 16){      // If the password is less than 8 or greater than 16 characters, it is invalid
            return false;
        }
        int count = 0;    
        String[] categories = {    // This array contains the categories that the password must meet
            "[a-z]",       
            "[A-Z]",       
            "\\d",        
            "[!@#$%^&*()_+{}|:<>?~]"         
        };

        for (String category : categories) {      // This loop checks if the password meets the categories
            Pattern pattern = Pattern.compile(category);       
            Matcher matcher = pattern.matcher(password);      
            if (matcher.find()) {       
                count++;
            }
        }
        return count == 3 || count == 4;      // If the count is 3 or 4, the password is valid, otherwise it is invalid
   }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();
        if (validPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
        
    }
}