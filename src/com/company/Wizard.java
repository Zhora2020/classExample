package com.company;

public class Wizard extends Unit {

    public Wizard(String name) {
        super(name);
        hp = 120;
        attack = 50;
    }

    public Wizard(int hp1, int attack1) {
        super(hp1, attack1);
    }

    public Wizard() {
        hp = 120;
        attack = 50;
    }

    @Override
    public void attack(Unit unit) {
        if (unit.getHp() <= 60){
            unit.getDamage(attack * 2);
        }
        else {
            super.attack(unit);
        }
    }

    public void plusHP(){
        hp += 10;
    }
}
