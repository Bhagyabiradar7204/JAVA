class ServiceProvider{
	public static boolean send(String name,String msg)
	{
		System.out.println("Start send in ServiceProvider");
		boolean ref=MsgProvider.send(name,msg);
		System.out.println("ref:"+ref);
		System.out.println("End send in ServiceProvider");
		
		return ref;
	}
}