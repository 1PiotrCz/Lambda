package com.company.Animals.Checkers;

import com.company.Animals.Animal;
import com.company.Animals.AnimalChecker;

/**
 * Created by Piotr Czubkowski on 2017-06-13.
 */
public class CheckJump implements AnimalChecker {
    @Override
    public boolean checkSkill(Animal animal) {
        return animal.isCanJump();
    }
}
