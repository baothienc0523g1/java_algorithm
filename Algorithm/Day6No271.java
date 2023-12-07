package Algorithm;


import java.util.ArrayList;

public class Day6No271 {

    /**
     * input:
     * output: fibonacci array number less than 100
     */
    static void fibonacciArray() {
        int initA = 0;
        int initB = 1;

        while (initA < 200) {
            System.out.print(initA + " ");
            int temp = initA;
            initA += initB;
            initB = temp;
        }
    }
    public static void main(String[] args) {
        fibonacciArray();
    }
}
