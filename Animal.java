package com.company;


import java.util.Objects;

abstract public class Animal {
    protected String name;
    protected Gender gender;

    public Animal(String str, Gender gender) {
        this.name = str;
        this.gender = gender;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && gender == animal.gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }


//    @Override
//    public boolean equals(Animal obj) {
//        if (obj.name == this.name && obj.gender == this.gender) {
//            return true;
//        }
//        return false;
//    }

    public void greeting() {
        System.out.println("Привет! Меня зовут " + this.name);
    }


}
