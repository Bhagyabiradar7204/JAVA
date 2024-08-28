class Doctor{
	String name;
	String hospital;
	
	Doctor(String name,String hospital)
	{
		System.out.println("Created Doctor String and String");
		this.name=name;
		this.hospital=hospital;
	}
	
		public void details()
	{
		System.out.println("name:"+this.name);
		System.out.println("hospital:"+this.hospital);
	
	
	}
}