package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day4No267 {

    static Map<String, Integer> appearCount(ArrayList<String> inputArray) {
        Map<String, Integer> result = new HashMap<>();

        for (String temp : inputArray) {
            if (!result.containsKey(temp)) {
                result.put(temp, 1);
            } else {
                result.put(temp, result.get(temp) + 1);
            }
        }

        return result;
    }
}
