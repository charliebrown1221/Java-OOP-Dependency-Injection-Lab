package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//        Weapon raygun=new Raygun();
//        Weapon mjolnir=new Mjolnir();
        Weapon bfg =new BFG();
        Attacker robot_one =new Robot(bfg);
//        Attacker robot_two =new Robot(raygun);
//        Attacker robot_three =new Robot(mjolnir);
         robot_one.Attack();
//         robot_two.Attack();
//         robot_three.Attack();
         Attacker wolf_one =new Werewolf("Remus Lupin",50);
         wolf_one.Attack();

    }
}