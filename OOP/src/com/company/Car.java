package com.company;

public class Car {
    String Color;
    int NumberofDoors;

    //Constructor with 2 argument.
    public Car(String color, int numberofDoors) {
        //Signature of this constructor is:
        //public car with 2 argument(String, Int)
        this.Color = color;
        this.NumberofDoors = numberofDoors;
    }

    public void carStart() {
        System.out.println("Car is Starting");
    }

    public void carDriving() {
        System.out.println("Car is Driving");
    }

    public void carStop() {
        System.out.println("Car is Stopping");
    }
}
