package Assignments;


import java.util.Scanner;


public class Assignment4 {
    
    public static void main(String[] args) {
        
        //System.out.println(args);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scanner.next();
        for (int i = s.length() - 1; i > -1; i--) { //index starts at the end of the string (s.length - 1) and runs in reverse order (i--)
                                                    // then stops before index reaches -1.
            System.out.print(s.charAt(i));    // prints the characters at the index "i" on the same line.}*/
        
        scanner.close();
        }

        

    
    
    
    }
    
}
