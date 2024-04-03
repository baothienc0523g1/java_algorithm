package Algorithm;

import java.util.ArrayList;

public class Day15No290 {

    /**
     * lấy các giá trị không trùng lặp trong 1 mảng*/
    public static ArrayList<Integer> day15No290(ArrayList<Integer> arrayList) {
       ArrayList<Integer> resultList = new ArrayList<>();

       for (int temp : arrayList) {
           if (!resultList.contains(temp)) {
               resultList.add(temp);
           }
       }
        return resultList;
    }
    
}
