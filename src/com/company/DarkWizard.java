package com.company;

interface Spell{
    void heal(Unit unit);
    void attack(Unit unit);
    void speedChange(Unit unit);
}

class MagicSpell implements Spell{

    int healValue = 0, speedValue = 0, attackValue = 0;

    @Override
    public void heal(Unit unit) {
        unit.getHeal(healValue);
    }

    @Override
    public void attack(Unit unit) {
        unit.getDamage(attackValue);
    }

    @Override
    public void speedChange(Unit unit) {
        unit.changeSpeed(speedValue);
    }

    public void use(Unit damaged, Unit healed, Unit speed){
        heal(healed);
        attack(damaged);
        speedChange(speed);
    }

    public MagicSpell(int heal, int speed, int attack) {
        this.healValue = heal;
        this.speedValue = speed;
        this.attackValue = attack;
    }
}


public class DarkWizard extends Wizard{

    public DarkWizard(String name) {
        super(name);
        attack = 70;
        hp = 85;
    }

    public DarkWizard(){
        attack = 70;
        hp = 85;
    }

    MagicSpell spells[] = {new MagicSpell(0, 200,1), new MagicSpell(0, 0,100), new MagicSpell(10, 10,10)};

    @Override
    public void attack(Unit unit) {
        super.attack(unit);
        double b = Math.random();
        spells[(int) Math.round(b * 2)].use(unit, this, this);
    }
}
