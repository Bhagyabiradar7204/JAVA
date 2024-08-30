//instance
package com.java.washingmachine;

public class Abhishek {
    WashingMachine Washingmachine=new WashingMachine();

    public void details()
    {
        if(Washingmachine!=null) {
            Washingmachine.rinse();
            Washingmachine.show();
        }
        else
        {
            System.out.println("Washingmachine is null");
        }
    }

}
