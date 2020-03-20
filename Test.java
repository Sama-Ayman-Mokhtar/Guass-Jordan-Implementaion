package com.company;

public class Test {
    public static void printArr(){
         for (int i = 0; i < Ioput.rows; i++) {
             for (int j = 0; j < Ioput.cols; j++) {
                 System.out.print(Ioput.arr.get(i).get(j)+"   ");

             }
             System.out.println();
         }
    }
}
