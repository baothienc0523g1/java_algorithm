public class Day1No261 {
    /**
     * input: int number
     * if number < 0: result = 0
     * output: sum of every prime number less than input*/
    static int sumOfPrimeNumber(int number) {
        int result = 0;

        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber(i)) {
                result += i;
            }
        }
        return result;
    }

    /**
     * input: int number
     * check if a number is a prime number or not
     * output: boolean*/
    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
