package Algorithm;

public class Day4No268 {

    /**
     * input: integer number
     * output: reverted number
     */
    static int numberRevert(int input) {
        int result = 0;

        while (input > 0) {
            result = (result * 10) + input % 10;
            input /= 10;
        }
        return result;
    }
}
