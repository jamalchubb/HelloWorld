package Notes;

import java.util.Arrays;

public class Gsort {

    public static < T extends Comparable<T>> void bubbleSort(T[] arr ){ // T extends Comparable<T> is a bound. It means that T must be a class that implements the Comparable interface.
        int n = arr.length;        // The length of the array
        boolean swapped;           // A flag to check if the array is already sorted.
        for (int i = 0; i < n - 1; i++) {       // The outer loop runs n-1 times.
            swapped = false;              // Initially, the array is not sorted.
            for (int j = 0; j < n - i - 1; j++) {       // The inner loop runs n-i-1 times.
                if (arr[j].compareTo(arr[j + 1]) > 0) {       // If the current element is greater than the next element, swap them.
                    T temp = arr[j];             // Swap the elements
                    arr[j] = arr[j + 1];        // Swap the elements
                    arr[j + 1] = temp;          // Swap the elements
                    swapped = true;             
                }  
            }
            if (!swapped) {             // If the array is already sorted, break the loop.
                break;
            }
            
        }
    }
 
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {    // T extends Comparable<T> is a bound. It means that T must be a class that implements the Comparable interface.
        if (arr.length <= 1) {            // Base case for recursion. If the array has only one element,  it is already sorted.
            return;
        }
        int mid = arr.length / 2;                // Find the middle index of the array.
        T[] left = Arrays.copyOfRange(arr, 0, mid);              // Create a new array and copy the first half of the elements of the original array.
        T[] right = Arrays.copyOfRange(arr, mid, arr.length);           // Create a new array and copy the second half of the elements of the original array.
        mergeSort(left);                      // Recursively sort the first half of the array.
        mergeSort(right);                     // Recursively sort the second half of the array.
        merge(arr, left, right);               // Merge the sorted halves.

    }

    private static <T extends Comparable<T>> void merge(T[] arr, T[] left, T[] right) {      // T extends Comparable<T> is a bound. It means that T must be a class that implements the Comparable interface.
        int i = 0, j = 0, k = 0;       // i is the index of the left array, j is the index of the right array, k is the index of the original array.
        while (i < left.length && j < right.length) {     // While both arrays have elements.
            if (left[i].compareTo(right[j]) <= 0){         // If the current element of the left array is less than or equal to the current element of the right array.
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {


        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};       // Create an array of integers.
        System.out.println("Original array: " + Arrays.toString(arr));       // Print the original array.
        bubbleSort(arr);            // Sort the array using bubble sort.
        System.out.println("Bubble Sorted array: " + Arrays.toString(arr));       // Print the sorted array.
        Integer[] arr2 = {64, 34, 25, 12, 22, 11, 90};      // Create an array of integers.
        mergeSort(arr2);             // Sort the array using merge sort.
        System.out.println("Merge Sorted array: " + Arrays.toString(arr2));        // Print the sorted array.
    }
    
}
