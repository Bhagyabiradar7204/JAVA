package com.Project.Bike;

public class Sweet  {

    private  String[] sweetNames = new String[7];
    private int index;

    public void store(String Name)
    {
        this.sweetNames[this.index] = Name;
        this.index++;
    }

    public void display()
    {
        for(String ref : sweetNames)
        {
            System.out.println(ref);
        }
    }

    public static void main(String[] args) {

        Sweet sweet = new Sweet();
        sweet.store("Kunda");
        sweet.store("Gulab jamun");
        sweet.store("Soan Papad");
        sweet.store("Rasgulla");
        sweet.store("Dharwad Peda");
        sweet.store("Barfi");
        sweet.store("Karadantu");

        sweet.display();
  }
}
