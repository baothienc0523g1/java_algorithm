package Algorithm;

public class Day8No276 {

    /**
     * input: int number
     * output: roman number
     */
    static String romanNumbersConverter(int input) {
        StringBuilder result = new StringBuilder();

        while (input > 0) {
            if (input > 1000) {
                result.append("Cái này chưa bit code hihi");
                break;
            }
            if (input <= 1000) {

            }
            if (input <= 500) {

            }
            if (input <= 100) {

            }
        }

        return result.toString();
    }
}
