package com.Project.Bike;

public class City  {

    private String [] cityNames = new String[7];
    private int index;

    public void store(String name)
    {
        this.cityNames[this.index]=name;
        this.index++;
    }

    public void display()
    {
        for(String ref : cityNames)
        {
            System.out.println(ref);
        }
    }

    public static void main(String[] args) {

        City city = new City();
        city.store("Delhi");
        city.store("Bangalore");
        city.store("Bijapur");
        city.store("Mumbai");
        city.store("Chennai");
        city.store("Jaipur");
        city.store("pune");

        city.display();
    }
}
