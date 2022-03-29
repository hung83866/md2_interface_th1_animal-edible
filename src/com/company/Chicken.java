package com.company;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chicken : ò ó o o..";
    }

    @Override
    public String howtoEat() {
        return "Gà chiên ngon nhức nách!";
    }
}
