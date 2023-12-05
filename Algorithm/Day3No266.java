package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Day3No266 {

    /**
     * input: String
     * output: Map - Repeated string
     */
    static Map<String, String> repeatString(String inputString) {
        Map<String, Integer> stringsMap = new HashMap<>();
        Map<String, String> result = new HashMap<>();
        String[] strings = inputString.split(" ");

        for (String string : strings) {
            String temp = string;
            if (!stringsMap.containsKey(temp) && !temp.isBlank()) {
                stringsMap.put(temp, 1);
            } else if (stringsMap.containsKey(temp) && !temp.isBlank()) {
                stringsMap.put(temp, stringsMap.get(temp) + 1);
            }
        }

        for (String temp : stringsMap.keySet()) {
            if (stringsMap.get(temp) > 1) {
                result.put(temp, " appear " + stringsMap.get(temp) + " times");
            }
        }

        return result;
    }
}
