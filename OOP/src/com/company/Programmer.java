package com.company;

class Programmer {
    String name;
    //Creating HAS-A relationship with Address class
    Address programmerAddr;
    Programmer(String name, Address addr){
        this.name=name;
        this.programmerAddr = addr;
    }
}
