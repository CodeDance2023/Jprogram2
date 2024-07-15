package myCollections;

import java.util.Collections;
import java.util.LinkedList;

public class M_binarySearch {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();   //Queue是一个接口，和List,Set同级别，都是Collection的子接口
        Collections.addAll(linkedList,1,2,3,4);
        //调用Collections里静态方法binarySearch查找元素的位置
        System.out.println(Collections.binarySearch(linkedList, 2));
    }

}


