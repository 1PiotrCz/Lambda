package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Piotr Czubkowski on 2017-05-22.
 */
public class Ex3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Piotrek", "Ania", "Monika");

        Collections.sort(names, (arg1, arg2) -> arg1.compareToIgnoreCase(arg2));
        for (String name : names) {
            System.out.println(name);
        }
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        for (String name : names) {
//
//        }
        Consumer consumer = arg1 -> System.out.println(arg1);
//        names.forEach(arg1 -> System.out.println(arg1));
        names.forEach(consumer);
    }
}
