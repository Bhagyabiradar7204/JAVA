class Fort
{
	public static String name(String location)
	{
		System.out.println("Start name in Fort");
		if(location=="Mysore"){	
		return "Mysore Palace";
		}
		if(location=="Bidar"){
	return "Bidar Fort";
	}
	    if(location=="Delhi"){
	return "Delhi Fort";
	}
	System.out.println("End name in fort");
	return "Not Matching";
	}
	
}