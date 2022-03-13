package com.company;

abstract class Instrument{
    //abstract method
    public abstract void createSound();

    public void shout() {
        this.createSound();
        System.out.println("Ahhhhh!");
    }
}

