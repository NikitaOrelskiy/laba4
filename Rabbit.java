package com.company;

public class Rabbit extends Animal implements Eating, Loving{

    public Rabbit(String name, Gender gender) {
        super(name, gender);
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
        System.out.println("Данный кролик любит " + a);
    }
}
