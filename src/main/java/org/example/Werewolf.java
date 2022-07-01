package org.example;

public class Werewolf implements Attacker {

    public String name;
    public int attackPower;

    public Werewolf(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name+ " attacks with his claws for "+this.attackPower+" damage!");
    }
}
