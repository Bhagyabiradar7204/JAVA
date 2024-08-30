//Instance or Non-Static variable
package com.army.gun;

public class Dboss {
    Gun gun=new Gun();

    public void murder()
    {
        if(gun!=null) {
            gun.fire();
            gun.display();
        }
        else
        {
            System.out.println("gun is null");
        }
    }


}
