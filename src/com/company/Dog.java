package com.company;

public class Dog extends Unit {

    public Dog(String name) {
        super(name);
        attack = 20;
        hp = 55;
    }

    public Dog(){
        attack = 20;
        hp = 55;
    }

    @Override
    public void print() {
        System.out.println("Dog " + name + ":");
        System.out.println("HP: " + hp);
        System.out.println("Speed: " + speed);
        System.out.println("Attack: " + attack);
    }
}
