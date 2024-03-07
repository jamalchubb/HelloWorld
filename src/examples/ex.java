package examples;

// This is a simple example of a class that has a method that takes an array of integers and returns the sum  and the difference of the elements in the array.

public class ex {
    public static int getMoney(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int loseMoney(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getMoney(arr));
        System.out.println(loseMoney(arr));
    }
    

}
