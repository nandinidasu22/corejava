package org.example;
import java.util.ArrayList;
import java.util.function.Predicate;

public class removeDuplicateArraylist {
    public static  void main(String ar[]){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Nandini");
        list.add(90.2);
        list.add(1);
        list.removeIf(Predicate.isEqual(1));
        System.out.println(list);

    }
}

