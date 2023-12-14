package Algorithm;

public class Day9No278 {
    /**
     * input:
     * output: tam zac can
     */
    static void isoscelesTriangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i <= j) {
                    System.out.print("*");
                }
                System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        isoscelesTriangle(9, 9);
    }
}