package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Day2No263 {

    /**
     * input String
     * output: map with each word in string
     * and how many times it appears
     */
    static Map<String, Integer> wordsAppearCount(String inputString) {
        Map<String, Integer> result = new HashMap<>();
        String[] strings = inputString.split(" ");

        for (String string : strings) {
            String temp = string.trim();
            if (!result.containsKey(temp)) {
                result.put(temp.trim(), 1);
            } else {
                result.put(temp.trim(), result.get(temp) + 1);
            }
        }
        return result;
    }
}
