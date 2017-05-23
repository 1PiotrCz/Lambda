package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Piotr Czubkowski on 2017-05-23.
 */
public class Stream {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Piotrek", "Adam", "Ola");
        myList.stream().filter(s -> s.startsWith("O")).forEach(s -> System.out.println(s));
    }
}
