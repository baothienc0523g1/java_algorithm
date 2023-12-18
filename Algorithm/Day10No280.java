package Algorithm;



public class Day10No280 {

    /** find mang doi xung
     * input:
     * output: symmetry array
     */
    static boolean symmetryArray(int[] inputArr) {
        int halfLength = inputArr.length / 2;
        int maxLength = inputArr.length;

        for (int i = 0; i <= halfLength; i++) {
            if (inputArr[i] != inputArr[maxLength - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
