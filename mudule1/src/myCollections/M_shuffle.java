package myCollections;

import java.util.Collections;
import java.util.Stack;

public class M_shuffle {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();   //Stack也是List的一个实现类，也有get(),也有序号
        Collections.addAll(stack,1,2,3,4);

        System.out.println(stack);   //打印是按照入栈的顺序打印的
        //调用shuffle方法打乱集合
        Collections.shuffle(stack);
        System.out.println(stack);


    }

}
