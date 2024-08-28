package com.shop.Bulb;

public class BulbRunner {
    public static void main(String []args){
        lightUp lightUp=new lightUp();
        lightUp.type="Zero";
        lightUp.turnoff();

        Bulb bulb=new lightUp();
        bulb.type="Tubelight";
        bulb.turnoff();
    }
}
