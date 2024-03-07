package Assignments;



import java.util.Arrays;

public class Assignment10 {

    // creates an array full of random integers.

    public static int[] createRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (right - left > 1){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid, right);
            merge(arr, left, mid, right);
        }

    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, right);
        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            if (i == leftArr.length) {
                arr[k] = rightArr[j++];
            } else if (j == rightArr.length) {
                arr[k] = leftArr[i++];
            } else if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i++];
            } else {
                arr[k] = rightArr[j++];
            }
        }
    }
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (! swapped) {
                break;
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        int[] arr = createRandomArray(100);
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Is array sorted? " + isSorted(arr));
        long start = System.currentTimeMillis();
        mergeSort(arr); // bubbleSort(arr)
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Is array sorted now? " + isSorted(arr));
        System.out.println(" ");
        System.out.println("Merge sort will sort faster than Bubble sort!");
        
    }
    
    
    
    
}
