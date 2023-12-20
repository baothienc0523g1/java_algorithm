package Algorithm;

public class Day12No284 {

    /**
     * swap a & b without temp variable input: array output: a & b swapped
     */
    public static void mySwapper() {
        int[] inputArr = {91, 1};

        System.out.println("Before: " + inputArr[0] + ", " + inputArr[1]);

        inputArr[0] = inputArr[0] + inputArr[1];
        inputArr[1] = inputArr[0] - inputArr[1];
        inputArr[0] = inputArr[0] - inputArr[1];

        System.out.println("After: " + inputArr[0] + ", " + inputArr[1]);
    }

    public static void main(String[] args) {
        mySwapper();
    }
}
