package Algorithm;

public class Day10No279 {
    /**
     * input:
     * output: revert a string
     */
    static String stringRevert(String input) {
        StringBuilder result = new StringBuilder();
        int size = input.length();

        for (int i = size - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}
