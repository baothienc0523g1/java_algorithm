package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day9No277 {
    /**
     * input: array of int number
     * output: the 2nd largest number
     */
    static int finderSecondLargest(ArrayList<Integer> input) {
        int result = 0;

        Collections.sort(input);
        Collections.reverse(input);

        int max = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) < max) {
                result = input.get(i);
                break;
            }
        }

        return result;
    }
}
