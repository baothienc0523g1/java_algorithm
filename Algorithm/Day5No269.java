package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day5No269 {

    /**
     * input: integer array
     * output: sum of 4 min number, sum of 4 greatest number
     */
    static Map<Integer, String> sumOfElements(ArrayList<Integer> input) {
        Map<Integer, String> result = new HashMap<>();
        int currentMin = input.get(0);
        int currentMax = input.get(0);
        int sum = 0;

        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);

            if (input.get(i) < currentMin) {
                currentMin = input.get(i);
            }

            if (input.get(i) > currentMax) {
                currentMax = input.get(i);
            }
        }

        int maxResult = sum - currentMin;
        int minResult = sum - currentMax;

        result.put(minResult, " is sum of 4 min numbers");
        result.put(maxResult, " is sum of 4 greatest numbers");
        return result;
    }
}
