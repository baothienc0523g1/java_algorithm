package Algorithm;

import java.util.Collections;

public class Day2No264 {

    /**
     * input: String
     * output: sorted string - ascending
     */
    static String ascendingString(String inputString) {
        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[j] < charArray[i]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            result.append(charArray[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String test = "dacbcddd";
        System.out.println("string ascending: " + ascendingString(test));
    }
}
