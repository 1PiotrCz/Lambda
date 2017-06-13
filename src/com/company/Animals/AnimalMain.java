package com.company.Animals;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Piotr Czubkowski on 2017-06-13.
 */
public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("Pikunio", true, true ,true));
        animalList.add(new Animal("Rybeczka", true, false ,true));
        animalList.add(new Animal("Zolwik", false, true ,true));
        animalList.add(new Animal("Paputek", false, false ,false));



        // ZAMIENIAMY NA LAMBDY
//        AnimalChecker checkJump = new CheckJump();
//        AnimalChecker checkRun = new CheckRun();
//        AnimalChecker checkSpeak = new CheckSpeak();

        checker(animalList, s -> s.isCanJump());
        checker(animalList, s -> s.isCanRun());
    }

    private static void checker(List<Animal> animals, AnimalChecker animalChecker){
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " : " + animalChecker.checkSkill(animal));
        }
    }
}
