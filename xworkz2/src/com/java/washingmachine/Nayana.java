package com.java.washingmachine;

public class Nayana {
    public void shop(){
        WashingMachine washingmachine=new WashingMachine();
        System.out.println("WashingMachine brand:"+washingmachine.brand);
        System.out.println("WashingMachine type:"+washingmachine.type);
        System.out.println("WashingMachine capacity:"+washingmachine.capacity);

        washingmachine.rinse();
        washingmachine.show();
    }
}
