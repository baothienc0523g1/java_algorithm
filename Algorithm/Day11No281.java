package Algorithm;

public class Day11No281 {
    /**
     * swap a & b without temp variable
     * input: array
     * output: a & b swapped
     */

    public static void valueSwapper(int[] inputArray) {
        System.out.println("before: " + inputArray[0] + ", " + inputArray[1]);
        inputArray[1] = inputArray[1] + inputArray[0];
        inputArray[0] = inputArray[1] - inputArray[0];
        inputArray[1] = inputArray[0] - inputArray[1];
        System.out.println("after: " + inputArray[0] + ", " + inputArray[1]);
    }
}
