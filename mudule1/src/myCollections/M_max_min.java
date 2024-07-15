package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M_max_min {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        Person p1 = new Person(1,"kobe");
        Person p2 = new Person(2,"james");
        Person p3 = new Person(3,"durant");
        Person p4 = new Person(4,"cui");
        Collections.addAll(arrayList, p1,p2,p3,p4);
        Person max = Collections.max(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int ageCompare = o1.age - o2.age;
                if (ageCompare == 0) {   //说明年龄相等
                    return o1.name.compareTo(o2.name);  //按照字符串默认的比较方法比较年龄
                } else {
                    return ageCompare;
                }
            }
        });
        System.out.println("最大值：" + max);

        //调用min方法,采访Comparable接口中的比较方法
        Person min = Collections.min(arrayList);
        System.out.println("最小值：" + min);
    }
}



class Person implements Comparable<Person> {  //Person类
    int age;
    String name;


    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{age = " + age + ", name = " + name + "}";
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}