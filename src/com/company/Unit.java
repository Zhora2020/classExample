package com.company;

public abstract class Unit {
    protected int hp = 100, attack = 10, speed = 1;
    protected String name = "";

    public int getHp() {
        return hp;
    }

    public void getHeal(int heal){
        hp += heal;
    }

    public void changeSpeed(int delta){
        speed += delta;
    }

    public int getAttack() {
        return attack;
    }

    private void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit(int hp1, int attack1){
        if (hp1 >= 0){
            hp = hp1;
        }
        else {
            hp = 0;
        }
        attack = attack1;
    }

    public void print(){
        System.out.println(name + ":");
        System.out.println("HP: " + hp);
        System.out.println("Speed: " + speed);
        System.out.println("Attack: " + attack);
    }

    protected void getDamage(int damage){
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    public void attack(Unit unit){
        unit.getDamage(attack);
    }

    public Unit() {
    }

    public Unit(String name){
        this.name = name;
    }
}
