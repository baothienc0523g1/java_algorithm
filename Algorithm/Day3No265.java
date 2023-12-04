package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day3No265 {

    /**
     * input: Array numbers
     * output: Repeated numbers
     */
    static List<Integer> repeatArray(ArrayList<Integer> inputArray) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (Integer temp : inputArray) {
            if (!integerMap.containsKey(temp)) {
                integerMap.put(temp, 1);
            } else {
                integerMap.put(temp, integerMap.get(temp) + 1);
            }
        }

        for (Integer temp : integerMap.keySet()) {
            if (integerMap.get(temp) > 1) {
                result.add(temp);
            }
        }
        return result;
    }
}
