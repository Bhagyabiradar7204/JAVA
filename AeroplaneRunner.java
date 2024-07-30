class AeroplaneRunner{
	public static void main(String []args)
	{
		System.out.println("Start main in AeroplaneRunner");
		
		Aeroplane ref=new Aeroplane();
		System.out.println("default type:"+ref.Type);
		
		Aeroplane ref1=new Aeroplane();
		System.out.println("Actual typee:"+ref1.Typee);
		
		Aeroplane ref2=new Aeroplane();
		System.out.println("default color:"+ref2.color);
		
		Aeroplane ref3=new Aeroplane();
		System.out.println("Actual color:"+ref3.colorr);
		
		System.out.println("End main in AeroplaneRunner");
		
	}
	
}