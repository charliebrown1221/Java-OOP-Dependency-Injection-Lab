package org.example;

import java.util.Scanner;

public class Robot implements Attacker{
//Instance variable (Has A)
    public String name;
   public Weapon weapon;
//Constructor
    public Robot(Weapon weapon) {
        System.out.println("whats the robots name?");
        Scanner sc =new Scanner(System.in);
        String newName=sc.nextLine();
        this.name=newName;
        this.weapon=weapon;
    }
//Method (can do)
    public void Attack(){
        System.out.println(this.name+ " attacks with their "+this.weapon.name+" for "+this.weapon.power+" damage!");
    }




}

