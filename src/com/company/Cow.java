package com.company;

public class Cow extends Animal{
    private String say = "mooo";

    public Cow(String name){
        super(name);
    }

    public void speak(){
        System.out.println(say);
    }

}
