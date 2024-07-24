class Queue{
	public static String accept(String name,String msg,double quantity)
	{
		System.out.println("Start accept in Queue");
		boolean ref1=ServiceProvider.send(name,msg);
		System.out.println("ref:"+ref1);
		System.out.println("Quantity :"+quantity);
		if (quantity==3)
			{
				System.out.println(quantity);
				return "Sent";
			}
		System.out.println("End accept in queue");
		return "NotSent";
	}
}