package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Wizard wizard = new Wizard("Gendalf");
        wizard.print();
        Dog dog = new Dog("Belka");
        DarkWizard darkWizard = new DarkWizard("Petor");
        darkWizard.attack(wizard);
        dog.attack(wizard);
        wizard.print();
        wizard.attack(dog);
        dog.print();
        darkWizard.print();
    }
}
