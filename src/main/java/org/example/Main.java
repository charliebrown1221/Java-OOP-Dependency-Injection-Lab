package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Raygun raygun=new Raygun();
        Mjolnir mjolnir=new Mjolnir();
        BFG bfg =new BFG();
        Robot robot_one =new Robot(bfg);
        Robot robot_two =new Robot(raygun);
        Robot robot_three =new Robot(mjolnir);
        System.out.println(robot_one.name);
        System.out.println(robot_two.name);
        System.out.println(robot_three.name);
         robot_one.Attack();
         robot_two.Attack();
         robot_three.Attack();

    }
}