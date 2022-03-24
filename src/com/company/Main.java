package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Fido");
        ArrayList<Animal> animals = new ArrayList<>();
        Dog dog = new Dog("Kenzo");
        Dog dog1 = new Dog("Viggo");
        Cat cat = new Cat("Mille");
        Cow cow = new Cow("Karsten");

        animals.add(dog);
        animals.add(dog1);
        animals.add(cat);
        animals.add(cow);

        for (int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i).getName() + " says ");
            animals.get(i).speak();
            if (animals.get(i) instanceof Dog) {
                System.out.println("Is a dog.");
                ((Dog) animals.get(i)).wag();
            } else if (animals.get(i) instanceof Cat) {
                System.out.println("Is a cat.");
            } else if (animals.get(i) instanceof Cow) {
                System.out.println("Is a cow.");
            }
        }
    }
}
