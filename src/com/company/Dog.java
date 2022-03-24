package com.company;

public class Dog extends Animal{
    private String say = "woof";

    public Dog(String name){
        super(name);
    }

    public void wag(){
        System.out.println("Wagging the tail");
    }

    public void speak(){
        System.out.println(say);
    }
}
