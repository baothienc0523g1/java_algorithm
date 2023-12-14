package Homework;

public class Question12 {

    public static void main(String[] args) {
        first10PrimeNumber();
    }
    public static void first10PrimeNumber() {
        int count = 0; //dùng để đếm số nguyên tố đã được in ra
        int temp = 0; //dùng để in ra màn hình nếu nó là số nguyên số

        while (count < 10) {
            temp++;
            if (isPrimeNumber(temp)) {
                System.out.println(temp);
                count++;
            }
        }
    }

    /**
     * method kiểm tra xem một số có phải là số nguyên tố hay không
     *
     * @param inputNum
     * @return boolean
     */
    private static boolean isPrimeNumber(int inputNum) {
        /**
         * nếu input nhỏ hơn 2 thì không đạt điều kiện là một số nguyên tố > false*/
        if (inputNum < 2) {
            return false;
        }

        /**
         * nếu input >= 2, chạy vòng lặp từ 2 đến căn bậc 2 của input
         * giải thích: trong khảng từ 2 đến input, nếu input không  chia hết cho bất kỳ
         * một số nào trong khoảng này thì cũng không chia hết cho các số lớn hơn khoảng đó*/
        for (int i = 2; i <= Math.sqrt(inputNum); i++) {
            if (inputNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
