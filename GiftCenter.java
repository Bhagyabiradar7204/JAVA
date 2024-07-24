class GiftCenter{
	public static void assign(String name,double price,String date,boolean urgent)
	{
		System.out.println("price:"+price);
		Amazon.deliver(name,date,urgent);
		
	}
}