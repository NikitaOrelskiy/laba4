package com.company;

import java.util.ArrayList;
import java.util.List;

public class Macropodidae extends Animal implements Jumpable, Eating, Loving {
    List<Macropodidae> children;
    public Macropodidae(String name, Gender gender) {
            super(name, gender);
            children = new ArrayList<>();
    }
    public Macropodidae(String name, Gender gender, List<Macropodidae> children) {
            super(name, gender);
            this.children = children;
    }

    @Override
    public String toString() {
       return "Кенгуру " + this.name;
    }

    @Override
    public void jump() {
        System.out.println("Я прыгаю как кенгуру! Я кенгуру!");
    }

    @Override
    public void jump(int dist) {
        if (dist < 0) {
            throw new InvalidJumpDistanceException();
        }
        System.out.println("Пругнул на " + dist + " метров");
    }


    @Override
    public void eat() {
        System.out.println("Я поел");
    }

    @Override
    public void eat(int numOfApples) {
        if (numOfApples < 0) {
            throw new InvalidNumOfApplesException();
        }
        System.out.println("Я поел " + numOfApples + " яблок");
    }

    @Override
    public void loving(Animal a) {
        System.out.println("Данное кенгуру любит " + a);
    }
}
