class Spoorti{
	public static String SendMsg(String name,String msg,double quantity)
	{
		System.out.println("Start sendmsg in spoorti");
		String ref2=Queue.accept(name,msg,quantity);
		System.out.println("ref:"+ref2);
		System.out.println("End sendmsg in spoorti");
		return "Sent";
	}
}