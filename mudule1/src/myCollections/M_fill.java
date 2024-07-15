package myCollections;

import java.util.ArrayList;
import java.util.Collections;

public class M_fill {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1,2,3,4);
        System.out.println("fill前："  + arrayList);
        //调用fill方法填充集合
        Collections.fill(arrayList,1);
        System.out.println("fill后：" + arrayList);
        //fill前：[1, 2, 3, 4]
        //fill后：[1, 1, 1, 1]
    }
}
