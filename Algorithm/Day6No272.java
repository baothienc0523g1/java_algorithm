package Algorithm;

public class Day6No272 {

    /**
     * input:
     * output: prime number finder
     */
    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
