package myCollections;

import java.util.ArrayList;
import java.util.Collections;

public class addAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "kobe", "James", "Jordan");
        System.out.println(arrayList);

    }
}

