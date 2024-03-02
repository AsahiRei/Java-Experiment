//utility functions (method)
//##created and coded by Arn Christian##
															//##03-02-2024##
//

//what is utility/auxiliary functions (method) ?:
//-it is a process of creating program
//-it is a piece of code that has a lot
//-of sources its kinda like "all in one"

//purposes:
//-shortening some of the longest code
//-make it easier to understand
//-it helps in many variety

//proper initializing:
//for initializing this utility i recommended
//to use the word "util" or "aux"
//make sure this is in your java folder
//otherwise won't work

import java.util.*;
public class Auxiliary {
    //short version of System.out.println
    //contains 4 datatypes in parameter (overloading):
    //string32 - String
    //int32 - Integer
    //double32 - Double
    //float32 - float
    //boolean32 - boolean
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
    //contains 4 datatypes in parameter (overloading):
    //string32 - String
    //int32 - Integer
    //double32 - Double
    //float32 - float
    //boolean32 - boolean
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
    //contains 4 datatypes in parameter (overloading):
    //string32 - String
    //int32 - Integer
    //double32 - Double
    //float32 - float
    //boolean32 - boolean
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
    //contain 1 parameter (overloading):
    //linear - straight line arrangement
    public void setLinearArray(int linear[]) {
        int i;
        for (i = 0; i < linear.length; i++) {
            System.out.print(linear[i] + " ");
        }
    }
    //two dimensional array
    //contain 1 parameter (overloading):
    //matrix - straight and bottom straight line arrangement
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
    //contain 1 parameter (overloading):
    //matrices - straight, bottom straight and layer line arrangement
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
    //strings alters
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
    //replace the value of index of array:
    //linear array
    public void linearReplace(int array[], int value, int replace) {
        array[value] = replace;
    }
    //string alter
    public void linearReplace(String array[], int value, String replace) {
        array[value] = replace;
    }
    //matrix array
    public void matrixReplace(int array[][], int row, int col, int replace) {
        array[row][col] = replace;
    }
    //string alter
    public void matrixReplace(String array[][], int row, int col, String replace) {
        array[row][col] = replace;
    }
    //matrices array
    public void matrixReplace(int array[][][], int row, int col, int layer, int replace) {
        array[row][col][layer] = replace;
    }
    //string alter
    public void matrixReplace(String array[][][], int row, int col, int layer, String replace) {
        array[row][col][layer] = replace;
    }
    
    //all in one Scanner
    //contain 1 parameter:
    //type - (you can choose the 3 following):
    //string32 - String
    //int32 - Integer
    //double32 - Double
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
    //returning the value from nextInput
    //with the following of depending datatype
    public String getInputString() {
        return inputString;
    }
    public int getInputInt() {
        return inputInt;
    }
    public double getInputDouble() {
        return inputDouble;
    }
    
    //odds & evens
    //odd & even checking
    //contain 1 parameter
    //int32 - Integer
    public void checkOddEven(int int32) {
        int value = int32;
        if (value %2 == 0) {
            System.out.println("Your number is: Odd");
        }
        else {
            System.out.println("Your number is: Even");
        }
    }
    //odd & even convertion
    //contains 2 parameters
    //string32 - String (must input numbers only)
    //enable - boolean (enable by this following):
    //true - it converts from String to Integer
    //false - disable
    private int odd_even_num;
    public void convertToOddOrEven(String string32, boolean enable) {
        String odd = "13579";
        String even = "02468";
        String res = "";
        int i = 0;
        while (i < string32.length()){
            char c = string32.charAt(i);
            //odd check
            switch (c) {
                case '1':
                	res = res + even.charAt(0);
                	break;
                case '3':
                	res = res + even.charAt(1);
                	break;
                case '5':
                	res = res + even.charAt(2);
                	break;
                case '7':
                	res = res + even.charAt(3);
                	break;
                case '9':
                	res = res + even.charAt(4);
                	break;
                default:
                break;
            }
            //even check
            switch (c) {
                case '0':
                	res = res + odd.charAt(0);
                	break;
                case '2':
                	res = res + odd.charAt(1);
                	break;
                case '4':
                	res = res + odd.charAt(2);
                	break;
                case '6':
                	res = res + odd.charAt(3);
                	break;
                case '8':
                	res = res + odd.charAt(4);
                	break;
                default:
                break;
            }
            i++;
        }
        //convert to Integer
        if (enable == true) {
            odd_even_num = Integer.parseInt(res);
        }
        else {
            odd_even_num = 0;
        }
        System.out.print(res);
        System.out.println();
    }
    //get the value
    public int getConvertion() {
        return odd_even_num;
    }
}
