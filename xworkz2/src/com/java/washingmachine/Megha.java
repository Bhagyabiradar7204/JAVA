//local Variable
package com.java.washingmachine;

public class Megha {
    public void details(){
        WashingMachine washingmachine=new WashingMachine();
        System.out.println("WashingMachine brand:"+washingmachine.brand);
        System.out.println("WashingMachine type:"+washingmachine.type);
        System.out.println("WashingMachine capacity:"+washingmachine.capacity);

        washingmachine.rinse();
        washingmachine.show();
    }

}
