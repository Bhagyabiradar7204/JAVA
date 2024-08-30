//Parameter
package com.java.washingmachine;

public class Laxmi {
    public void display(WashingMachine washingmachine)
    {
        if (washingmachine != null)
        {
            System.out.println(washingmachine.brand);
            System.out.println(washingmachine.type);
            System.out.println(washingmachine.capacity);
            washingmachine.rinse();
            washingmachine.show();
        } else
        {
            System.out.println("washingmachine is null");
        }
    }

}
