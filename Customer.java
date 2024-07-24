class Customer{
	public static boolean travel()
	{
		System.out.println("Start travel in Customer");
		boolean ref1=Agency.advanceBook();
		System.out.println("ref1:"+ref1);
		System.out.println("end travel in Customer");
		
		
	return ref1;
	}
}