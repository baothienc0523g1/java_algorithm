package Algorithm;

import java.util.Collections;

public class Day2No264 {

    /**
     * input: String
     * output: sorted string - ascending
     */
    static String ascendingString(String inputString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char minChar = inputString.charAt(i);
            for (int j = 1; j < inputString.length(); j++) {
                if (inputString.charAt(j) < inputString.charAt(i)) {
                    minChar = inputString.charAt(j);
                }
            }
            result.append(minChar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("result: " + ascendingString("aAbBc"));
    }
}
