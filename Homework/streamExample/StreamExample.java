package Homework.streamExample;


import java.util.Random;

public class StreamExample {

    public static String orderCodeGenerate() {
        StringBuilder newCode = new StringBuilder("DSOD-");
        Random random = new Random();
        Integer sixDigitNum = random.nextInt(999999);
        newCode.append(sixDigitNum);
        return newCode.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(orderCodeGenerate());
        }
    }
}
