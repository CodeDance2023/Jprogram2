package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class M_sort {
    public static void main(String[] args) {
        //1.无参sort, 如果是自定义类型的排序必须实现Comparable接口,String,Integer等自带的类已经自动实现了
        ArrayList<Student> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, new Student(1), new Student(2), new Student(3));
        Collections.sort(arrayList);
        System.out.println(arrayList);


        //2. 带参数sort,可以自己指定排序规则
        LinkedList<Student> list = new LinkedList<>();
        Collections.addAll(list, new Student(18), new Student(20), new Student(23));
        Collections.sort(list, (o1, o2) -> o2.age - o1.age);  //lambda表达式
        System.out.println(list);

    }


}






class Student implements Comparable<Student> {  //学生类
    int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{age = " + age + "}";
    }
    public int compareTo(Student s1) {
        return this.age - s1.age;
    }
}