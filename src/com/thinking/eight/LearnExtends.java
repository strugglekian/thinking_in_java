package com.thinking.eight;

public class LearnExtends extends Lunch{
    Bread bread = new Bread();
    public static void main(String[] args) {
        new LearnExtends();
    }
}

class Meal{
    public Meal() {
        System.out.println("meal");
    }
}

class Lunch extends Meal{

    public Lunch() {
        System.out.println("Lunch");
    }
}

class Bread{
     Bread() {
        System.out.println("bread");
    }
    void getBread(){
        System.out.println("Bread,getBread");
    }
}