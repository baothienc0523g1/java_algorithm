package Algorithm;

import java.util.*;

public class Day15No289 {

    /**
     * loại bỏ giá trị trùng lặp trong 1 mảng*/
    public static ArrayList<Integer> no289(ArrayList<Integer> arrayList) {
       ArrayList<Integer> resultList = new ArrayList<>();

       for (int temp : arrayList) {
           if (!resultList.contains(temp)) {
               resultList.add(temp);
           }
       }
        return resultList;
    }
    
}
