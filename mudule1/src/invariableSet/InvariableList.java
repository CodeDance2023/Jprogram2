package invariableSet;

import java.util.ArrayList;
import java.util.List;

public class InvariableList {
    public static void main(String[] args) {
        //创建一个不可变的list集合
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
