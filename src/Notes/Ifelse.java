package Notes;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
/*  int a = 2;
    if (a < 100) {
        System.out.println("50");
    } else if (a < 200) {
        System.out.println("150"); 
    } else if (a < 300) {
        System.out.println(250);
    } else {
        System.out.println(350);
    }*/
    
//  using for loops
    
/*  for(int i = 0; i < 10; i++) {
        if (i == 2)
            break; // this breaks the loop once i is equal to 2.
        System.out.println(i); */
    
//  using while loops

/*    int i = 0;
    while (i < 10) {
        System.out.println(i);
        i++;

    }*/
    

    // switch statement switches the i for whatever number is equal to i (which is 0) and prints it then moves to the next case and executes again.

    int i = 0;
    switch (i) {
        case 0:
            System.out.println(0);
        case 1:
            System.out.println(1);
        default:
            break;
    }
    
    Scanner scanner = new Scanner(System.in);


    System.out.println("Please enter your name: ");
    String str = scanner.nextLine();
    System.out.println("Your name is " + str);
    System.out.println("Please enter your age: ");
    int age = scanner.nextInt();
    System.out.println("Your age is " + age);
    scanner.close();
    
    
    }
    
    















}
    
    










