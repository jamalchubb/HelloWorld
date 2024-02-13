package Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class Assignment7 {
    
    public static int[] createRandomArray(int arrayLength) {

        int[] arr = new int[arrayLength];
        Random rand = new Random();
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;

    }

    public static void writeArrayToFile(int[] array, String filename){
        int i, j;
        try{
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("%d %d\n".formatted(array.length, array[0].length));
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[i].length; j++) {
                   bw.write("%d".formatted(array[i][j]));
                   if (j != array[i].length - 1)
                      bw.write(" ");
                }
                if (i != array.length - 1)
                   bw.write("\n");
             }
             bw.close();
          } catch (Exception e) {
             System.out.println(e);
        }
    }

    public static int[] readFileToArray(String filename){
        int i, j;
      try {
         FileReader reader = new FileReader("matrix3.txt");
         BufferedReader br = new BufferedReader(reader);
         String line = br.readLine();
         String [] tokens = line.split(" ");
         int rows =  Integer.parseInt(tokens[0]);
         int cols = Integer.parseInt(tokens[1]);
         //arr = new int[rows][cols];
         for (i = 0; i < rows; i++) {
            line = br.readLine();
            tokens = line.split(" ");
            for (j = 0; j < cols; j++){
               //arr[i][j] = Integer.parseInt(tokens[j]);
            }
         }
         br.close();
      }  catch(Exception e) {
         System.out.println(e);
      }
    return null;
    } 
    public static void bubbleSort(int[]array){
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++){
            if(array[i] > array[i + 1]) {
                swap( array, i, i+1);
            }

        }
        bubbleSort(array);
    }

    private static void swap(int[] array, int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swap'");
    }
    public static void main(String[]args){
        
        int[] array = createRandomArray(100);
        writeArrayToFile(array, "GeneratedArray");
        readFileToArray("GeneratedArray");
        bubbleSort(array);
        writeArrayToFile(array, "SortedArray");
        readFileToArray("SortedArray");
        
        
        
        
        }
}
