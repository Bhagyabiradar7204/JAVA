class WardrobeRunner{
	public static void main(String []args)
	{
		System.out.println("Start main in wardroberunner");
		
		Wardrobe ref=new Wardrobe();
		System.out.println("default value:"+ref.size);
		
		Wardrobe ref1=new Wardrobe();
		System.out.println("Actual value:"+ref1.sizes);
		
		Wardrobe ref2=new Wardrobe();
		System.out.println("default color:"+ref2.color);
		
		Wardrobe ref3=new Wardrobe();
		System.out.println("Actual color:"+ref3.colors);
		
		System.out.println("End main in wardroberunner");
	}
}