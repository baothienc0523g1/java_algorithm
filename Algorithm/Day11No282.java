package Algorithm;

public class Day11No282 {
    /**
     * Bubble Sort Algorithm
     * Bắt đầu từ cuối dãy > về đầu dãy. Đổi chỗ các cặp phần tử
     * liền kề nhau để đưa phần tử nhỏ hơn trong cặp phần tử đó
     * về đầu dãy hiện tại. Sau đó không xét đến nó ở vòng lặp tiếp theo
     * Best case: 0^n
     * Avg case: 0^n2
     * Worst case: 0^n2
     * input:
     * output:
     */
    public static void myBubbleSort(int[] inputArr) {

        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = inputArr.length - 1; j > i; j--)
                if (inputArr[j] < inputArr[j - 1]) {
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j - 1];
                    inputArr[j - 1] = temp;
                }
        }
    }


    /**
     * Selection Sort Algorithm
     * Chọn phần tử nhỏ nhất trong dãy hiện tại, đưa nó về vị trí đầu tiên
     * trong dãy hiện tại.
     * Sau mỗi vòng lặp, dãy còn lại n-1 phần tử. Lặp lại các bước trên cho
     * đến khi dãy còn 1 phần tử
     * Best case: 0^n2
     * Avg case: 0^n2
     * Worst case: 0^n2
     * input:
     * output:
     */

    static void mySelectionSort(int[] array) {

        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }


    /**
     * Insertion Sort Algorithm
     * Tìm cách chèn phần tử a[i] vào vị trí thích hợp để có dãy mới
     * với a[0] a[1] ...a[i-1] trở nên có thứ tự
     * Best case: 0^n
     * Avg case: 0^n2
     * Worst case: 0^n2
     * input:
     * output:
     */
    static void myInsertionSort(int[] array) {

        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
}
