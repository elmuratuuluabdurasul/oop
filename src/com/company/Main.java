package com.company;

public class Main {
    public static void main(String[] args) {
        Balyk balyk = new Balyk();

        balyk.setName("Altynbalyk");
        balyk.setColor("blue");
        balyk.setAge(3);

        System.out.println(balyk.getName());
        System.out.println(balyk.getColor());
        System.out.println(balyk.getAge());
        System.out.println();

        Cat cat = new Cat();

        cat.setName("Tom");
        cat.setColor("yellow");
        cat.setAge(5);

        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getAge());
        System.out.println();

        Dog dog = new Dog();
        dog.setName("Bobik");
        dog.setType("Taigan");
        dog.setAge(4);

        System.out.println(dog.getName());
        System.out.println(dog.getType());
        System.out.println(dog.getAge());
        System.out.println();

        

    }
}