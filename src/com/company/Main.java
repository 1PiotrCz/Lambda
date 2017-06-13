package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //to jest metoda z jakiego API // IntegerMath pochodzi z API
//        public void makeSomeNoise(IntegerMath math){

        List<String> names = Arrays.asList("Frania", "Hania", "Zuzia", "Piotrek");
        Consumer consumer = str -> System.out.println(str);
        //names.forEach(consumer);
        //names.stream().filter(s -> s.startsWith("K")).forEach(consumer);

    }

    public static void printList(List<String> list, Consumer<String> consumer) {
        for (String str : list) {
            consumer.accept(str);
        }
    }

    // TO JEST METODA Z JAKIEGOS API // IntegerMath pochodzi z api
    public void makeSomeNoise(IntegerMath math) {

    }
}