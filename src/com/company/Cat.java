package com.company;

public class Cat extends Animal{
    private String say = "meow";

    public Cat(String name){
        super(name);
    }

    public void speak(){
        System.out.println(say);
    }
}
