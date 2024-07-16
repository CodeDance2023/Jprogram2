package stream;


import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        //单列集合
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Collections.addAll(arrayList,1,2,3,4,5);
//        arrayList.stream().forEach(System.out::println);
//
        //双列集合: 需要转为单列集合
//        HashMap<Integer,String> hs = new HashMap<>();
//        hs.put(1,"kobe");
//        hs.put(2,"aobe");
//        hs.put(3,"cobe");
//        hs.put(4,"dobe");
//        Set<Map.Entry<Integer, String>> entries = hs.entrySet();
//        entries.stream().forEach(System.out::println);
        //数组：利用Arrays里面的静态方法Arrays.stream()
//        int[] a = {1,2,3,4};
//        Stream.of(a).forEach(System.out::println);   //如果数组利用下面的of()方法获取流，放进去流里面就是数组的地址，并不是元素
//        Arrays.stream(a).skip(2).forEach(System.out::println);

        //一堆零散数据，但是要保证数据类型一致，利用Stream类的静态方法,Stream.of()
//        int a1 = 1;
//        boolean b = false;
//        Student2 student2 = new Student2(2);
//        Stream.of(a1,b,student2).forEach(System.out::println);
//
//        System.out.println("--------------");
//










        //stream流的中间方法
       HashSet<Integer> hashSet = new HashSet<>();
       Collections.addAll(hashSet,1,2,3,4,5);
       //filter
//       hashSet.stream().filter(new Predicate<Integer>() {
//           @Override
//           public boolean test(Integer integer) {
//               return integer > 2;                        //如果返回的是true,说明这个数据留下，如果是false就被过滤掉
//           }
//       }).forEach(System.out::println);


        //limit
//        hashSet.stream().limit(3).forEach(System.out::println);

        //skip
//        hashSet.stream().skip(3).forEach(System.out::println);


        //distinct:去重
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Collections.addAll(arrayList,1,1,2,3,4,5);
//        arrayList.stream().distinct().forEach(System.out::println);


        //concat: 合并两个流为一个
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//
//        Collections.addAll(arrayList,1,2,3,4,5);
//        Collections.addAll(arrayList2, 6,7,8,9,10);
//
//        Stream<Integer> stream1 = arrayList.stream();  //获取第一个流
//        Stream<Integer> stream2 = arrayList2.stream();  //获取第一个流
//        Stream<Integer> newStream = Stream.concat(stream1, stream2);   //合并两个流得到一个新的流
//        //打印流的数据
//        newStream.forEach(System.out::println);

        //map: 转换流里面的数据类型
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Collections.addAll(arrayList,1,2,3,4,5);
//        arrayList.stream().map(new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return integer + "";
//            }
//        }).forEach(System.out::println);




        //终结方法

        //count()
//         ArrayList<Integer> arrayList = new ArrayList<>();
//         Collections.addAll(arrayList,1,2,3,4,5);
//         long count = arrayList.stream().count();
//         System.out.println(count);

        //toArray(): 收集流里面的数据到数组中
//        Stack<Integer> stack = new Stack<>();
//        Collections.addAll(stack, 1,4,5,4,4,43,5,5);
//        Integer[] array = stack.stream().toArray(new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {
//                return new Integer[value];
//            }
//        });
//        System.out.println(Arrays.toString(array));


        //collect() : 收集到集合中
        //单列集合
//        Stack<Integer> stack = new Stack<>();
//        Collections.addAll(stack, 1,4,5,4,4,43,5,5);
//        List<Integer> list = stack.stream().collect(Collectors.toList());
//        System.out.println(list);

        //双列集合,需要传递两个匿名内部类对象
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "1-kobe","2-brown","3-james","4-mike");
        Map<Integer, String> newMap = arrayList.stream().collect(Collectors.toMap(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[0]);
            }
        }, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[1];
            }
        }));
        System.out.println(newMap);



    }
}








//class Student2 {
//    int age;
//
//    public Student2() {
//    }
//
//    public Student2(int age) {
//        this.age = age;
//    }
//
//    /**
//     * 获取
//     * @return age
//     */
//    public int getAge() {
//        return age;
//    }
//
//    /**
//     * 设置
//     * @param age
//     */
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String toString() {
//        return "Student2{age = " + age + "}";
//    }
//}