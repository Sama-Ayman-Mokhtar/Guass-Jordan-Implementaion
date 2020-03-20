package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Ioput {
    public static int rows;
    public static int cols;
    public static ArrayList<ArrayList<Double>> arr = new ArrayList<ArrayList<Double>>();

    public static void fillArray(){
        int numOfEqu ;
        System.out.print("Enter The Number of Knows : ");
        Scanner scan = new Scanner(System.in);
        numOfEqu = Integer.parseInt(scan.nextLine());
        rows = numOfEqu;
        cols = numOfEqu + 1;
        for (int i = 0; i < rows; i++) {
            arr.add(new ArrayList<Double>());
            System.out.println("__________enter equ " + (i + 1) + "_________");
            for (int j = 0; j < cols ; j++) {
                if(j != (cols - 1)){
                    System.out.print("coeff of " + (char)('a' + j) + " : ");
                     arr.get(i).add(scan.nextDouble());
                }
                else{
                    System.out.print("const"+ " : ");
                     arr.get(i).add(scan.nextDouble());
                }


            }
            scan.nextLine();
        }

    }
    public static void printResult(){
        System.out.println("_________ Result_________");
        for (int i = 0; i < rows; i++) {
            System.out.println((char)('a' + i )+ " : " + arr.get(i).get(cols -  1));

        }
    }

}
