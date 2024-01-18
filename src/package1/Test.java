/*
 * This is a test file.
 */

package package1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Hello, world.");
    
    }

}
