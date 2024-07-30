class CoinRunner{
	public static void main(String []args)
	{
		System.out.println("Start main in CoinRunner");
		
		Coin ref=new Coin();
		System.out.println("default shape:"+ref.shape);
		
		Coin ref1=new Coin();
		System.out.println("Actual shapee:"+ref1.shapee);
		
		Coin ref2=new Coin();
		System.out.println("default color:"+ref2.color);
		
		Coin ref3=new Coin();
		System.out.println("Actual color:"+ref3.colorr);
		
		System.out.println("End main in CoinRunner");
		
	}
	
}