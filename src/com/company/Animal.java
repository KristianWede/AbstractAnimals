package com.company;

import java.awt.*;

public class Animal {

    private String name;
    private String say;

    public void speak(){
        System.out.println(say);
    }

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, String color){
        this.name = name;
        this.color = color.valueOf(color);
    }

    public String getName(){
        return name;
    }

}
