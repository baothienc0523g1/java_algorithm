package Algorithm;

public class Day16No292 {

    /**
     * swap a and b without temp variable*/
    public static void swapper(int a, int b) {
        System.out.println("BEFORE");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("AFTER");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swapper(a, b);
    }
}
