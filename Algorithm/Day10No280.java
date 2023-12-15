package Algorithm;

import java.util.ArrayList;


public class Day10No280 {

    /**
     * input:
     * output: symmetry array
     */
    static boolean symmetryArray(int[] inputArr) {
        int halfLength = inputArr.length / 2;
        int maxLength = inputArr.length;

        for (int i = 0; i <= halfLength; i++) {
            if (inputArr[i] != inputArr[maxLength - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
