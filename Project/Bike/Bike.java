package com.Project.Bike;

public class Bike  {

    String[] bikeNames = new String[7];
    int index;

    public void store(String Name)
    {
        this.bikeNames[this.index]= Name;
        this.index++;
    }

    public void display()
    {
        for(String ref : bikeNames)
        {
            System.out.println(ref);
        }
    }

    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.store("KTM");
        bike.store("Rapid racer");
        bike.store("speed sprinter");
        bike.store("Pulsar");
        bike.store("velocity viper");
        bike.store("pace predator");
        bike.store("Royal Enfield");

        bike.display();
   }
}
