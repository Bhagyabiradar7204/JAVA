class ShoeShop{
	public static double purchase(String brand)
	{
		System.out.println("Start purchase in ShoeShop");
		double ref=ShoeFactory.order("puma");
		System.out.println("ref:"+ref);
		System.out.println("End purchase in ShoeShop");
		
		return ref;
	}
}