package com.Project.Bike;

public class River  {

    private  String[] riverNames = new String[7];
    private int index;

    public void store(String Name)
    {
        this.riverNames[this.index] = Name;
        this.index++;
    }

    public void display()
    {
        for(String ref : riverNames)
        {
            System.out.println(ref);
        }
    }

    public static void main(String[] args) {

        River river = new River();
        river.store("Ganga");
        river.store("Narmada");
        river.store("Bheema");
        river.store("Krishna");
        river.store("Doni");
        river.store("Brahmaputra");
        river.store("Indus");

        river.display();
     }
}
