package Homework;

public class Question1 {
    static void primeNumberBelow100(int inputNum) {

    }

    /**
     * method kiểm tra xem một số có phải là số nguyên tố hay không
     * @param num
     * @return boolean*/
    private boolean isPrimeNumber(int inputNum) {
        /**
         * nếu input nhỏ hơn 2 thì không đạt điều kiện là một số nguyên tố*/
        if (inputNum < 2) {
            return false;
        }


        /**
         * nếu input >= 2, chạy vòng lặp từ 2 đến căn bậc 2 của input
         * giải thích: trong khảng từ 2 đến input, nếu input */
        for (int i = 2; i <= Math.sqrt(inputNum); i++) {
            if (inputNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
