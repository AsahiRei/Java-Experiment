//utility functions
//created and coded by arn
//03-01-2024

//purposes:
//-shortening some of the longest code
//-make it easier to understand

import java.util.*;
public class Utility {
    //short version of System.out.println
    public void println(String string32) {
        System.out.println(string32);
    }
    //integer alt
    public void println(int integer32) {
        System.out.println(integer32);
    }
    //double alt
    public void println(double double32) {
        System.out.println(double32);
    }
    //float alt
    public void println(float float32) {
        System.out.println(float32);
    }
    //boolean alt
    public void println(boolean boolean32) {
        System.out.println(boolean32);
    }
    
    //short version of System.out.print
    public void print(String string32) {
        System.out.print(string32);
    }
    //integer alt
    public void print(int integer32) {
        System.out.print(integer32);
    }
    //double alt
    public void print(double double32) {
        System.out.print(double32);
    }
    //float alt
    public void print(float float32) {
        System.out.print(float32);
    }
    //boolean alt
    public void print(boolean boolean32) {
        System.out.print(boolean32);
    }
    
    //short version of System.out.printf
    public void printf(String string32) {
        System.out.printf(string32);
    }
    //integer alt
    public void printf(String pattern, int integer32) {
        System.out.printf(pattern, integer32);
    }
    //double alt
    public void printf(String pattern, double double32) {
        System.out.printf(pattern, double32);
    }
    //float alt
    public void printf(String pattern, float float32) {
        System.out.printf(pattern, float32);
    }
    //boolean alt
    public void printf(String pattern, boolean boolean32) {
        System.out.printf(pattern, boolean32);
    }
    
    //one dimensional array
    public void setLinearArray(int linear[]) {
        int i;
        for (i = 0; i < linear.length; i++) {
            System.out.print(linear[i] + " ");
        }
    }
    
    //creating short code for arrays
    //two dimensional array
    public void setMatrixArray(int matrix[][]) {
        int row;
        int col;
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    //three dimensional array
    public void setMatricesArray(int matrices[][][]) {
        int row;
        int col;
        int layer;
        for (row = 0; row < matrices.length; row++) {
            for (col = 0; col < matrices[row].length; col++) {
                for (layer = 0; layer < matrices[row][col].length; layer++) {
                    System.out.print(matrices[row][col][layer] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    //string alters
    public void setLinearArray(String linear[]) {
        int i;
        for (i = 0; i < linear.length; i++) {
            System.out.print(linear[i] + " ");
        }
    }
    public void setMatrixArray(String matrix[][]) {
        int row;
        int col;
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public void setMatricesArray(String matrices[][][]) {
        int row;
        int col;
        int layer;
        for (row = 0; row < matrices.length; row++) {
            for (col = 0; col < matrices[row].length; col++) {
                for (layer = 0; layer < matrices[row][col].length; layer++) {
                    System.out.print(matrices[row][col][layer] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    //all in one Scanner
    private String inputString;
    private int inputInt;
    private double inputDouble;
    public void nextInput(String type) {
        Scanner s = new Scanner(System.in);
        if (type.equals("string32")) {
            inputString = s.nextLine();
        }
        else if (type.equals("int32")) {
            inputInt = s.nextInt();
        }
        else if (type.equals("double32")) {
            inputDouble = s.nextDouble();
        }
        else {
            System.out.println("Wrong data type");
        }
    }
    public String getInputString() {
        return inputString;
    }
    public int getInputInt() {
        return inputInt;
    }
    public double getInputDouble() {
        return inputDouble;
    }
    //replace the value of index of array
    public void arrayIndexReplace(int array[], int value, int replace) {
        array[value] = replace;
    }
    //string alter
    public void arrayIndexReplace(String array[], int value, String replace) {
        array[value] = replace;
    }
}
