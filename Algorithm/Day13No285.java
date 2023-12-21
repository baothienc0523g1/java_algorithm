package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day13No285 {

    /**
     * find 3rd greatest number in array
     */
    public static int finderExample(List<Integer> integers) {
        Collections.sort(integers);
        int result = 0;


        int count = 0;
        int maxIndex = integers.size() - 1;
        int max = integers.get(maxIndex);

        for (int i = maxIndex - 1; i >= 0; i--) {
            if (integers.get(i) < max) {
                count++;
            }

            if (count == 2) {
                result = integers.get(i);
                break;
            }
        }

        return result;
    }
}
