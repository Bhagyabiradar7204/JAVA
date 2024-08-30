//Parameter
package com.army.gun;

public class Police {

    public void encounter(Gun gun)
    {
        if (gun != null)
        {
            System.out.println(gun.name);
            System.out.println(gun.Countrymade);
            System.out.println(gun.type);
            gun.fire();
            gun.display();
        } else
        {
            System.out.println("gun is null");
        }
    }

}
