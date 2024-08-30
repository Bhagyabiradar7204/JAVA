//Main method
package com.army.gun.Runner;

import com.army.gun.*;

public class GunRunner {
    public static void main(String[] args) {
        Gun gun = new Gun();
        System.out.println("Local Variable");
        Soldier soldier=new Soldier();
        soldier.war();

        System.out.println("Parameter");
        Police police = new Police();
        police.encounter(gun);

        System.out.println("Instance");
        Dboss dboss=new Dboss();
        dboss.murder();

        System.out.println("Return");
        Godse godse=new Godse();
        if(godse!=null){
            System.out.println("Gun name:"+gun.name);
            System.out.println("Gun countrymade:"+gun.Countrymade);
            System.out.println("Gun type:"+gun.type);
        }
        else{
            System.out.println("godse is null");
        }
    }
}
