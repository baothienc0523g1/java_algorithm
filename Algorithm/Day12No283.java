package Algorithm;

public class Day12No283 {

    /**
     * find 2nd greatest number in array
     */
    public static int finderResolver(int[] inputArr) {
        int result = 0;

        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = inputArr.length - 1; j > i; j--)
                if (inputArr[j] < inputArr[j - 1]) {
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j - 1];
                    inputArr[j - 1] = temp;
                }
        }

        int max = inputArr[inputArr.length - 1];
        for (int i = inputArr.length - 2; i >= 0; i--) {
            if (inputArr[i] < max) {
                result = inputArr[i];
                break;
            }
        }

        return result;
    }
}
