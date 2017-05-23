package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

/**
 * Created by Piotr Czubkowski on 2017-05-23.
 */
public class Ex2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(12);
        System.out.println(map(integerList, a -> a + 5));
    }

    public static List map(List<Integer> list, IntFunction<Integer> operate) {
        List<Integer> newList = new ArrayList<>();
        for (int i : list) {
            newList.add(operate.apply(i));
        }
        return newList;
    }
}
