//local Variable
package com.army.gun;

public class Soldier {
    public void war(){
        Gun gun=new Gun();
        System.out.println("Gun name:"+gun.name);
        System.out.println("Gun countrymade:"+gun.Countrymade);
        System.out.println("Gun type:"+gun.type);

        gun.fire();
        gun.display();
    }
}
