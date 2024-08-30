package com.army.gun;

public class Gun {
    public String name="Rifle";
    public String Countrymade="Germany";
    public String type="Long";

    public Gun(){
        System.out.println("Cretaed Gun using no args cons-----");
    }
    public void fire(){
        System.out.println("created fire");
    }

    public void display(){
        System.out.println("Gun name:"+name);
        System.out.println("Gun countrymade:"+Countrymade);
        System.out.println("Gun type:"+type);
    }



}
