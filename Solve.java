package com.company;

public class Solve {

    public static void loopCols(){
        for (int i = 0; i < (Ioput.cols - 1); i++) {
            normalize(i);
            zeros(i);
        }
    }
    private static void normalize(int i){
        double one = Ioput.arr.get(i).get(i);
        for (int k = 0; k < Ioput.cols ; k++) {
            Ioput.arr.get(i).set(k, (Ioput.arr.get(i).get(k) / one) );

           //
        }
    }
    private static void zeros(int i){
        for (int j = 0; j < Ioput.rows ; j++) {
            if(j == i || Ioput.arr.get(j).get(i) == 0)
                continue;
            else{
                double constant = -1 * (Ioput.arr.get(j).get(i));
                for (int k = 0; k < Ioput.cols ; k++) {
                    Ioput.arr.get(j).set(k, (Ioput.arr.get(j).get(k)) + (constant * (Ioput.arr.get(i).get(k)) ));

                }
            }
        }
    }
}

