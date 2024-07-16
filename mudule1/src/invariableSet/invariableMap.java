package invariableSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;

public class invariableMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1,"wade");
        hs.put(2,"Ewen");
        hs.put(3,"paul");
        hs.put(4,"Lin");
        hs.put(5,"bron");
//        //调用静态方法of创建不可变的Map集合，最多可以创建10对键值对对象
//        Map<Integer, String> integerStringMap = Map.of(24, "kobe", 23, "jordan", 6,
//                "james",35, "durant",59,"cui");

        //如果要创建更多的键值对对象，可以利用ofEntries或者copyOf()方法
        //1.ofEntries()
        //因为这个方法的参数是一个可变的参数，本质是一个数组，因此要先创建一个数组才能传参
        //获取所有键值对象
        Set<Map.Entry<Integer, String>> entries = hs.entrySet();
        //获取键值对对象的数组
        Map.Entry[] array = entries.toArray(new Map.Entry[0]);
        //调用ofEntries()方法
        Map map = Map.ofEntries(array);
        System.out.println(map);

        //copyOf(): 底层如果传参是不可变的集合，就直接返回，如果不是，还是会利用ofEntries()方法变成不可变的集合
        Map<Integer, String> integerStringMap = Map.copyOf(hs);
        System.out.println(integerStringMap);


    }
}
