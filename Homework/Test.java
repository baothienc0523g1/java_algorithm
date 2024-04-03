package Homework;

public class Test {

    public static void fibonacci(int limit) {
        int initValue = 0;
        int temp = 1;

        while (initValue <= limit) {
            System.out.println(initValue);
            int a = initValue;
            initValue = temp;
            temp += a;
        }
    }

    public static void main(String[] args) {
        fibonacci(100);
    }
}