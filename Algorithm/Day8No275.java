package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Day8No275 {
    /**
     * input: number array
     * output: sum of 2 random number which = target;
     */
    static ArrayList<Integer> sumOfRandomNumber(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int temp = arr[i];
                if (target - arr[j] == temp) {
                    result.add(i) ;
                    result.add(j) ;
                    return result;
                }
            }
        }
        return result;
    }

}
