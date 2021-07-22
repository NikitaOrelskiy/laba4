package com.company;

public class Bear extends Animal implements Eating{
    public Bear(String name, Gender gender) {
        super(name, gender);
    }

    public Macropodidae becomeMacropodidae() {
        return new Macropodidae(this.name, this.gender);
    }

    @Override
    public void greeting() {
        System.out.println("Нет времени объяснять, я люблю есть мед");
    }

    public void sing() {
        System.out.println("Хорошо живет на свете Винни-Пух,\n" +
                "Оттого поет он эти песни вслух,\n" +
                "И неважно, чем он занят,\n" +
                "Если он худеть не станет,\n" +
                "А ведь он худеть не станет\n" +
                "(если конечно, вовремя подкрепиться), да!\n" +
                "\n");
    }

    @Override
    public void eat() {

    }

    @Override
    public void eat(int numOfApples) {

    }
}

