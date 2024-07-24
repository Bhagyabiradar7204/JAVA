class Agency{
	public static boolean advanceBook()
	{
		System.out.println("start advanceBook in Agency");
		boolean ref=Company.booked();
		System.out.println("ref:"+ref);
		System.out.println("end advanceBook in Agency");
		
		
	return ref;
		
		
		
		
	}
}