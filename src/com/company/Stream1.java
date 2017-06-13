package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.StrictMath.abs;

/**
 * Created by Piotr Czubkowski on 2017-05-23.
 */
public class Stream1 {
    public static void main(String[] args) {

        //statyczny import
        abs(5 - 20);

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

        String obiekt = "Nauka jest fajna";
//        String obiekt = null; // te dwie linie by łatwiej zrozumiec nulla jezeli slowo null sie zastapi innym w "" wtedy takie samo pojawi sie ponizej
        Optional<String> myOptional = Optional.ofNullable(obiekt);

        if (myOptional.isPresent()) {
            System.out.println("Obiekt istnieje " + myOptional.get());
        }else {
            System.out.println("Obiekt jest nullem");
        }

//        Optional<String> optional = Optional.of(null);
//        optional.ifPresent(s -> System.out.println(s));
//
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        } else {
//            System.out.println("Ten obiekt jest nulem");



            System.out.println("-------------------");

//            Stream.of("a1", "a2", "a3")
//            Stream.of("a123", "a2444", "a322")
//                    .map(s -> s.substring(1))// zamiana na liczby
//                    .mapToInt(s -> Integer.valueOf(s)) // zkazdej wartosi wyciagnac integera
//                    .map(s -> s + 100) // do kazdej wartosci dopisujemy 100
////                    .max()
//                    .min()
//                    .ifPresent(s -> System.out.println(s));

        List<String> myListInteger = Arrays.asList("a222", "b2222", "c13123", "d34525");

        myListInteger
                .stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::valueOf)
                .map(s -> s + 100)
                .min()
                .ifPresent(System.out::println);

        long values =  IntStream
                .of(5,10,124,123)
                .sum();
        System.out.println(values);


            IntStream.of(5, 10, 123, 255)
                    .average()
                    .ifPresent(System.out::println);

            long value = IntStream
                    .of(6, 77, 99, 122)
                    .sum();
            System.out.println(value);

            List<Person> personList = new ArrayList<>();
            personList.add(new Person("Piotr", 22));
            personList.add(new Person("Oskar", 26));
            personList.add(new Person("Marek", 28));
            personList.add(new Person("Olaf", 29));
            personList.add(new Person("Lukasz", 31));

            String message = personList.stream()
                    .filter(person -> person.getAge() >= 18)
                    .map(person1 -> person1.getName())
                    .collect(Collectors.joining(" i ", "Powyżej 18 lat są", " ."));
            System.out.println(message);

            Double aver = personList
                    .stream()
                    .collect(Collectors.averagingInt((person -> person.getAge())));

            System.out.println("Srednia wieku to: " + aver);

            IntSummaryStatistics statistics = personList
                    .stream()
                    .collect(Collectors.summarizingInt((person -> person.getAge())));

            System.out.println("statystyki:" + statistics);

            List<String> converted =
                    personList
                            .stream()
                            .map(s -> s.getName())
                            .collect(Collectors.toList());

//            System.out.println(converted);


            List<Person> personList1 = new ArrayList<>();
            personList1.add(new Person("Piotr", 22));
            personList1.add(new Person("Oskar", 26));
            personList1.add(new Person("Marek", 22));
            personList1.add(new Person("Olaf", 29));
            personList1.add(new Person("Lukasz", 31));

            Map<Integer, List<Person>> groupByAge = personList1
                    .stream()
                    .collect(Collectors.groupingBy(o -> o.getAge()));
//
            groupByAge.forEach((a, b) -> System.out.println(a + " : " + b.toString()));


//            System.out.println(groupByAge.values());

//BiConsummer
//            groupByAge.forEach((key, value) -> System.out.println("Key" + key));
//            groupByAge.forEach((key, value) -> printList(value));


            List<String> names = Arrays.asList("Katarzyna", "Piotrek", "Ola", "Marta", "Michał");

            names
                    .stream()
                    .map(s-> {
                        if (s.endsWith("a")) {
                            return s + "(K)";
                        } else {
                            return s + "(M)";
                        }

//                    }).forEach(System.out::println);

                    }).mapToInt(s->s.length())
                    .max()
                    .ifPresent(System.out::println);

            List<String> womanNames = names
                    .stream()
                    .filter(s -> s.endsWith("a"))
                    .collect(Collectors.toList());

        }


    }

//    public static void printList(List list) {
//        for (Person p : list) {
//            System.out.println("Person" + p.toString());
//        }


