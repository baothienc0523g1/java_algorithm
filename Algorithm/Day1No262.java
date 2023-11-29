package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Day1No262 {

    /**
     * input: String
     * count how many times every character appear*/
    static Map<Character, Integer> characterAppearCount(String inputString) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char tempChar = inputString.charAt(i);
            if (!countMap.containsKey(tempChar)) {
                countMap.put(tempChar, 0);
            }
            countMap.put(tempChar, countMap.get(tempChar) + 1);
        }
        return countMap;
    }
}
