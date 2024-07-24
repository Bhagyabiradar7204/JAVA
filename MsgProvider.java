class MsgProvider{
	public static boolean send(String name,String msg)
	{
		System.out.println("Start send in MsgProvider");
		
		System.out.println("Name :"+name + "&" + "Msg :"+msg);
		
		if (name=="Ambani" && msg=="dowell")
			{
				System.out.println("Ambani do well");
				return true;
			}
			
			
			System.out.println("End send in MsgProvider");
			
			return true;
			
	}
}