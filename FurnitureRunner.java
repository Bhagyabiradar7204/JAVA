class FurnitureRunner{
	public static void main(String []args)
	{
		System.out.println("Start main in FurnitureRunner");
		
		Furniture ref=new Furniture();
		System.out.println("default type:"+ref.Type);
		
		Furniture ref1=new Furniture();
		System.out.println("Actual typee:"+ref1.Typee);
		
		Furniture ref2=new Furniture();
		System.out.println("default color:"+ref2.color);
		
		Furniture ref3=new Furniture();
		System.out.println("Actual color:"+ref3.colorr);
		
		System.out.println("End main in FurnitureRunner");
		
	}
	
}