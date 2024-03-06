package Assignments;

// importing packages 

import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;






// creates a new class using file "Assignment5" which is accessible from anywhere in code and other classes in different packages.
public class Assignment5 {

//     creates a class to generate a new matrix filled with random numbers.

    public static void generateMatrix(int[][] mat, int rows, int cols) {
        Random rand = new Random();             // declares "rand" as a random number
        int i, j;
        for (i = 0; i < rows; i++){
            for (j = 0; j < cols; j++) {
                mat[i][j] = rand.nextInt(10); // the matrix of random numbers has a range from 0-10

            }
        }
    }

//     creates a class to multiply matricies 
    public static void matrixMultiply(int[][] mat1, int[][] mat2, int[][] mat3) {
        int i, j, k;
        for (i = 0; i < mat3.length; i++){
            for (j = 0; j < mat3[i].length; j++) {
                mat3[i][j] = 0;
                for (k = 0; k < mat1[i].length; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
   }

    public static void printMatrix(int[][] mat) {
        int i;
        for ( i = 0 ; i < mat.length; i++); {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
    
    public static void writeArray(int[][] mat, String filename) {
        int i, j;
        try {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(mat.length + " " + mat[0].length + "\n");
            for (i = 0; i < mat.length; i++) {
                for (j = 0; j < mat[i].length; j++) {
                    bw.write(mat[i][j] + " ");
                }
                bw.write("\n");
            }
            bw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void readArray(int[][] mat, String filename) {
        int i, j;
        try {
            FileReader reader = new FileReader("matrix3.txt");
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            String[] tokens = line.split(" ");
            int rows = Integer.parseInt(tokens[0]);
            int cols = Integer.parseInt(tokens[1]);
            mat = new int[rows][cols];
            for (i = 0; i < rows; i++) {
                line = br.readLine();
                tokens = line.split(" ");
                for (j = 0; j < cols; j++) {
                    mat[i][j] = Integer.parseInt(tokens[j]);
                }
            }
            br.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();
        scanner.close();
        int [][] mat1 = new int[integer][2];
        int [][] mat2 = new int[2][2];
        int [][] mat3 = new int[integer][2];

        if (0 <= integer && integer <= 9) {
            generateMatrix(mat1, integer, 2);
            generateMatrix(mat2, 2, 2);
            matrixMultiply(mat1, mat2, mat3);

            writeArray(mat1, "matrix1.txt");
            writeArray(mat2, "matrix2.txt");
           
            writeArray(mat3, "matrix3.txt");
        }   


    }








}
