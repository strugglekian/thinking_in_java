package com.thinking.night;

public class LearnAbstract {
    public static void main(String[] args) {
        Instrument instrument = new Wind();
        instrument.play();
        instrument.sound();
    }
}

abstract class Instrument {
    void play() {
        System.out.println("super instruments");
    }

    ;

    abstract void sound();
}

class Wind extends Instrument {

    @Override
    void sound() {
        System.out.println("sub,it sound a loud!");
    }

    void adjust() {
        System.out.println("down Casting!");
    }
}