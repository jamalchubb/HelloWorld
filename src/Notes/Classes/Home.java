package Notes.Classes;

// This program demonstrates how to create classes in java.

// "public" allows you to be able to use the class in multiple files.
// "private" makes code only accessible within the declared class.
// "protected" makes code accessible in the same package and subclasses. 

public class Home {
    protected int i = 0;
    String name = "Home";

    public Home() {
        this(10);
        System.out.println("Home constructor");
        System.out.println("i = " + i);
    }

    public Home(int i) {
        this.i = i;
    }


    public void test() {

        System.out.println("Home test");

    }
}
