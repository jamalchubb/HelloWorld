package Assignments;

// This assignment is about implementing Bubble Sort and Merge Sort using Generics.

import java.util.Arrays;

public class Assignment11< T extends Comparable<T>> {

    // Bubble Sort
    public void bubbleSort(T[] arr) {
        int n = arr.length;             
        for (int i = 0; i < n - 1; i++) {      
            for( int j = 0; j < n - i - 1; j++) {       
                if (arr[j].compareTo(arr[j + 1]) > 0) {      
                    T temp = arr[j];             
                    arr[j] = arr[j + 1];        
                    arr[j + 1] = temp;          
                }
            }
            
        }
    }
    
    // Merge Sort
    public void mergeSort(T[] arr) {    
        if (arr.length <= 1) {            
            return;
        }
        int mid = arr.length / 2;               
        T[] left = Arrays.copyOfRange(arr, 0, mid);             
        T[] right = Arrays.copyOfRange(arr, mid, arr.length);           
        mergeSort(left);                      
        mergeSort(right);                    
        merge(arr, left, right);              

    }

    private void merge(T[] arr, T[] left, T[] right) {      
        int i = 0, j = 0, k = 0;       
        while (i < left.length && j < right.length) {     
            if (left[i].compareTo(right[j]) <= 0){         
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
        Assignment11<Integer> sort = new Assignment11<Integer>();

        Integer[] arr = {78, 12, 8, 47, 18, 25, 2};
        System.out.println();  
        System.out.println("Original Array:" + Arrays.toString(arr));   
        
        // Bubble Sort
        System.out.println();
        long start = System.nanoTime();
        sort.bubbleSort(arr);
        long end = System.nanoTime();
        System.out.println("Bubble Sort:" + Arrays.toString(arr)); 
        System.out.println("Time taken by Bubble Sort: " + (end - start) + " nanoseconds");
        
        

        // Merge Sort
        System.out.println();
        long start2 = System.nanoTime();
        sort.mergeSort(arr);
        long end2 = System.nanoTime();
        System.out.println("Merge Sort:" + Arrays.toString(arr));  
        System.out.println("Time taken by Merge Sort: " + (end2 - start2) + " nanoseconds");


    }
}
