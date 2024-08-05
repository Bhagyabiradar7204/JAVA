class CoffeePowderRunner{
   public static void main(String []args)
   {
	   CoffeePowder CoffeePowder=new CoffeePowder();
	   
	   CoffeePowder CoffeePowder1=new CoffeePowder("Levista");
	   System.out.println("CoffeePowder1 company:"+CoffeePowder1.company);
	   
	   CoffeePowder CoffeePowder2=new CoffeePowder("Bru",1,2/8/24,200);
	   System.out.println("CoffeePowder2 company:"+CoffeePowder2.company);
	   System.out.println("CoffeePowder2 weight:"+CoffeePowder2.weight);
	   System.out.println("CoffeePowder2 manfdate:"+CoffeePowder2.manfdate);
	   System.out.println("CoffeePowder2 cost:"+CoffeePowder2.cost);
	   
	   
	   CoffeePowder CoffeePowder3=new CoffeePowder("Red label",3/8/24);
	   System.out.println("CoffeePowder3 company:"+CoffeePowder3.company);
	   System.out.println("CoffeePowder3 manfdate:"+CoffeePowder3.manfdate);
	   
	   CoffeePowder CoffeePowder4=new CoffeePowder(1);
	   System.out.println("CoffeePowder weight:"+CoffeePowder4.weight);
	      
	      
   }
}