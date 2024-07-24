class Hotels 
{
public static void order1()
{ 
System.out.println("start order1 in hotel");
String item="Rotti";
System.out.println("Item="+item);
System.out.println("End order1 in hotel");
}
public static void order1(String item)
{ 
System.out.println("start order1 in hotel");
System.out.println("Item="+item);

System.out.println("End order1 in hotel");
}public static void order2()
{ 
System.out.println("start order2 in hotel");
String item="puliyogare";
double price=60;
System.out.println("Item="+item);
System.out.println("price="+price);


System.out.println("End order in hotel");
}
public static void order2(String item,double price)
{ 
System.out.println("start order in hotel");
System.out.println("Item="+item);
System.out.println("price="+price);
System.out.println("End order in hotel");
}public static void order3()
{ 
System.out.println("start order3 in hotel");
String item="Chapathi";
double price=80;
double quantityInGram=50;
System.out.println("Item"+item);
System.out.println("price"+price);
System.out.println("quantityInGram"+quantityInGram);
System.out.println("End order3 in hotel");
}
public static void order3(String item,double price,double quantityInGram)
{ 
System.out.println("start order3 in hotel");
System.out.println("Item="+item);
System.out.println("price="+price);
System.out.println("quantityInGram="+quantityInGram);


System.out.println("End order3 in hotel");
}
public static void order4()
{ 
System.out.println("start order4 in hotel");
String item="tomato bath";
double price=40;
double quantityInGram=100;
boolean parcel=true;
System.out.println("Item="+item);
System.out.println("price="+price);
System.out.println("quantityInGram="+quantityInGram);
System.out.println("parcel="+parcel);
System.out.println("End order4 in hotel");
}
public static void order4(String item,double price,double quantityInGram,boolean parcel)
{ 
System.out.println("start order4 in hotel");
System.out.println("Item="+item);
System.out.println("price="+price);
System.out.println("quantityInGram="+quantityInGram);
System.out.println("parcel="+parcel);

System.out.println("End order4 in hotel");
}

public static void main(String[] args){
	System.out.println("start in main");
	order1();
	order1("puri");
	order1("chitranna");
	order2();
	order2("palav",20);
	order2("mosaranna",30);
	order3();
	order3("gheeRice",30,40);
	order3("jeerarice",90,20);
	order4();
	order4("kushka",30,40,true);
	order4("biryani",60,90,false);
	
	System.out.println("End in main");
}

}
