package Assignments;

import java.util.Scanner;


public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scanner.next();
       
        for (int i = 4; -1 < i && i < word.length(); i--) { //index starts at 4 and runs in reverse order (i--) then stops before index reaches -1.
            System.out.print(word.charAt(i));    // prints the characters at the index "i" on the same line.
        }
        

        

    
    
    
    }
    
}
