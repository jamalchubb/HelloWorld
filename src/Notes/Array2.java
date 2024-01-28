package Notes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

/*public class Array2 {
   public static void generateMatrix(int[][] mat, int rows, int cols) {
      Random rand = new Random();
      int i, j;
      for (i = 0; i < rows; i++) {
          for (j = 0; j < cols; j++) {
                 mat[i][j] = rand.nextInt(10); 
          }
       
      }
   }

   public static void matrixMultiply(int[][] mat1, int[][] mat2, int[][] mat3) {
      int i, j, k;
      for (i = 0; i < mat3.length; i++) {
         for (j = 0 ; j< mat3[i].length; j++) {
            mat3[i][j] = 0;
            for (k = 0; k < mat1[i].length; k++) {
               mat3[i][j] += mat1[i][k] * mat2[k][j];
            }
         }
      }
   }
   

   public static void printMatrix(int[][] mat) {
      int i;
      for (i = 0; i < mat.length; i++) {
         System.out.println(Arrays.toString(mat[i]));
      }
   }

   public static void writeArray(int[][] mat, String filename) {
      int i, j;
      try{
         FileWriter writer = new FileWriter(filename);
         BufferedWriter bw = new BufferedWriter(writer);
         bw.write("%d %d\n".formatted(mat.length, mat[0].length));
         for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
               bw.write("%d".formatted(mat[i][j]));
               if (j != mat[i].length - 1)
                  bw.write(" ");
            }
            if (i != mat.length - 1)
               bw.write("\n");
         }
         bw.close();
      } catch (Exception e) {
         System.out.println(e);
      }

   }

   public static void readArray(int[][] mat, String filename) {
      int i, j;
      try {
         FileReader reader = new FileReader("matrix3.txt");
         BufferedReader br = new BufferedReader(reader);
         String line = br.readLine();
         String [] tokens = line.split(" ");
         int rows =  Integer.parseInt(tokens[0]);
         int cols = Integer.parseInt(tokens[1]);
         mat = new int[rows][cols];
         for (i = 0; i < rows; i++) {
            line = br.readLine();
            tokens = line.split(" ");
            for (j = 0; j < cols; j++){
               mat[i][j] = Integer.parseInt(tokens[j]);
            }
         }
         br.close();
      }  catch(Exception e) {
         System.out.println(e);
      }
   }

   public static void main(String[] args) throws Exception {

//       Matrix 1 and 2, comprised of random integers, are multiplied together to form matrix 3.

         int [][] mat1 = new int[2][3]; // 2 rows 3 columns
         int [][] mat2 = new int[3][4]; // 3 rows 4 columns
         int [][] mat3 = new int[2][4]; // 2 rows 4 columns
         
        
         generateMatrix(mat1,2,3);
         generateMatrix(mat2, 3, 4);
         matrixMultiply(mat1, mat2, mat3);

         System.out.println("Matrix 1");
         printMatrix(mat1);
         System.out.println("Matrix 2:");
         printMatrix(mat2);
         System.out.println("Matrix 3:");
         printMatrix(mat3);

         writeArray(mat1,"matrix1.txt");
         writeArray(mat2,"matrix2.txt");
         writeArray(mat3,"matrix3.txt");

         
         int[][] mat4 = new int[2][4];
         readArray(mat4,"matrix3.txt");
         writeArray(mat4, "matrix4.txt");

   }*/
   


   //       creates an array "a" of 10 integers from 0-9.

/*       int [] a = new int[10];
         Random rand = new Random();
         //String [] a = new String[10];
         for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
         }
         System.out.println(Arrays.toString(a));
         for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
         }*/

//       creates an array "a" of 10 integers using the declaration variable "double" from 0-9.

         /*double[] a = new double[10];
         for (int i = 0; i < a.length; i++) {
            a[i] = i;
         }
         System.out.println(Arrays.toString(a));
         for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
         }*/

//       prints our the length of arguments entered in command line.
    
/*       System.out.println(args.length);   
         System.out.print(Arrays.toString(args));*/

         //converts string into an integer

/*       int i = Integer.parseInt("123");    
         System.out.println(i);*/
         
//       creates one dimensional and two dimensional arrays.

/*       int[] numbers = new int[5];                 //one dimensional array.
         int array[][] = {{1,2,3},{4,5,6}};*/          // 2 dimensional array.
}
