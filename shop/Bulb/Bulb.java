package com.shop.Bulb;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Bulb {
    public String type;
    public Bulb()
    {
        System.out.println("created bulb using no arg cons------");
    }
    public void turnoff()
    {
        System.out.println("type:"+type);
    }

}
