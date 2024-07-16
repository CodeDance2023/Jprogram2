package invariableSet;

import java.util.Set;

public class invariableSet {
    public static void main(String[] args) {
        //创建一个不可变的Set集合
        Set<Integer> integers = Set.of(1, 2, 3, 4, 5);
        integers.forEach(System.out::println);
    }
}
