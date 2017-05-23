package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Piotr Czubkowski on 2017-05-23.
 */
public class Stream1 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Piotrek", "Adam", "Ola");
        myList
                .stream()
//                .filter(s -> s.startsWith("O"))
                .filter(s -> s.length() > 4)
                .sorted((s, s1) -> s.compareToIgnoreCase(s1))
                .map(s -> s.toUpperCase())
//                .forEach(s -> System.out.println(s));
//        .findFirst() .// zastapienie forEach + ifPresent
                .findAny()
                .ifPresent(s -> System.out.println(s));

        String obiekt = null; // te dwie linie by łatwiej zrozumiec nulla jezeli slowo null sie zastapi innym w "" wtedy takie samo pojawi sie ponizej
        Optional<String> optional = Optional.ofNullable(obiekt);
//        Optional<String> optional = Optional.of(null);
        optional.ifPresent(s -> System.out.println(s));

        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Ten obiekt jest nulem");


            System.out.println("-------------------");

//            Stream.of("a1", "a2", "a3")
            Stream.of("a123", "a2444", "a322")
                    .map(s -> s.substring(1))// zamiana na liczby
                    .mapToInt(s -> Integer.valueOf(s)) // zkazdej wartosi wyciagnac integera
                    .map(s-> s+100) // do kazdej wartosci dopisujemy 100
//                    .max()
                    .min()
                    .ifPresent(s -> System.out.println(s));

            IntStream.of(5,10,123,255)
                .average()
                .ifPresent(System.out::println);

            long value = IntStream
                    .of(6,77,99,122)
                    .sum();
            System.out.println(value);
    }
    }
}
