package Notes.Classes;

/* Overloading means to use the same name while having multiple methods in the same class (ex. public App() and public App(String name))    
   Overwriting in a subclass, you will replace a method in a super class. Re implementing method defined in superclass.
*/


public class App{
    
    public App() {

    }

    public App(String name) {       /// calling public App(name) in the main function will  print out name.
        System.out.println(name);
    }

    public static void main(String[] args) {
        App app = new App("World");
    }

    public static void main() {
        App app = new App();
    }
} 

class Test extends App {       // extends what is already in App class to Test class
    public Test() {
        super("Test");
    }



    public static void main(String[] args) {      // overrides the "public static void main(String[] args)" method thats in the App class. (line 18).
        Test test = new Test();;
    }
}
    

