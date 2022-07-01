package org.example;

public class Robot {
//Instance variable (Has A)
    public String name;
   public Weapon weapon;
//Constructor
    public Robot(Weapon weapon) {
        this.name="Iron Giant";
        this.weapon=weapon;
    }
//Method (can do)
    public void Attack(){
        System.out.println(this.name+ " attacks with their "+this.weapon.name+" for "+this.weapon.power+" damage!");
    }




}

