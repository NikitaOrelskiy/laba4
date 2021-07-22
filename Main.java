package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void turnGreeting(Animal ...animals) {
        for(Animal animal: animals) {
            animal.greeting();
        }
    }

    public static void jump(Jumpable... jumpers) {
        for(Jumpable jumper: jumpers) {
            jumper.jump();
        }
    }

    public static void main(String[] args) {

        Macropodidae babyRoo = new Macropodidae("Крошка Ру", Gender.MALE);
        Macropodidae kanga = new Macropodidae("Кенга", Gender.FEMALE, List.of(babyRoo));
        Bear pooh = new Bear("Винни-Пух", Gender.MALE);
        Rabbit rabbit = new Rabbit("Кролик", Gender.MALE);


        Set<Animal> guestsSet = new HashSet<>();

        guestsSet.add(kanga);
        guestsSet.add(pooh);
        guestsSet.add(rabbit);
        guestsSet.add(babyRoo);

        class Greeting {
            public void greet() {
                System.out.println("Привет!");
            }
        }

        Greeting g = new Greeting();

        g.greet();

//        System.out.println(guestsSet.contains(kanga));
//        System.out.println(guestsSet.contains(babyRoo));
//        System.out.println(guestsSet.size());
//
//        System.out.println(kanga.hashCode());
//        System.out.println(babyRoo.hashCode());

        kanga.greeting();
        babyRoo.greeting();
        pooh.greeting();
        rabbit.greeting();


        kanga.jump(8);
        try {
            kanga.jump(-1);
        } catch (InvalidJumpDistanceException e) {
            System.out.println("невалидные данные");
        }

        try {
            pooh.eat(3);
        } catch (InvalidNumOfApplesException e) {
            System.out.println("невалидные данные");
        }

        rabbit.loving(babyRoo);




        Jumpable x = new Jumpable() {
            @Override
            public void jump() {

            }

            @Override
            public void jump(int distance) {

            }

            public int x() {
                return 123;
            }
        };
    }
}
