package com.java.washingmachine;

public class WashingMachine {
    public String brand="Samsung";
    public String type="Standard";
    public double capacity=3.5;

    public WashingMachine(){
        System.out.println("Cretaed WashingMachine using no args cons-----");
    }
    public void rinse(){
        System.out.println("created rinse");
    }

    public void show(){
        System.out.println("WashingMachine brand:"+brand);
        System.out.println("WashingMachine type:"+type);
        System.out.println("WashingMachine capacity:"+capacity);
    }

}
