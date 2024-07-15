package myCollections;

import java.util.*;

public class M_copy {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Collections.addAll(arrayList, 1,2,3,4);
        Collections.copy(arrayList,arrayList);
        System.out.println(arrayList2);  //集合为空：[]
        System.out.println(arrayList);  //[1,2,3,4]
    }
}
