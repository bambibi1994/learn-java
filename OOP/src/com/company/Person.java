package com.company;

public class Person {
    //name of type string
    String name;
    //age of type int
    int age;
    //location of type String
    String location;
    Person(){
        this.name = "unknown";
        this.age = 0;
        this.location = "Area 51";
    }

    Person(String name,int age, String location){
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void sayHello() {
        System.out.println("Hello This is a person.");
    }
    //setName
    //getName
    //setLocation
    //getLocation
    //setAge
    //getAge
}
