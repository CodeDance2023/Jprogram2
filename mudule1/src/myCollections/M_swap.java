package myCollections;

import java.util.Collections;
import java.util.Stack;

public class M_swap {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Collections.addAll(stack,1,2,3,4,5);
        System.out.println("Swap value between index 1 and index 2:");
        System.out.println("before being swapped: " + stack);
        Collections.swap(stack,1,2);
        System.out.println("after being swapped: " + stack);
    }
}
