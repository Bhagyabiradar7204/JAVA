class CCTVRunner{
	public static void main(String []args)
	{
		System.out.println("Start main in CCTVRunner");
		
		CCTV ref=new CCTV();
		System.out.println("default type:"+ref.Type);
		
		CCTV ref1=new CCTV();
		System.out.println("Actual typee:"+ref1.Typee);
		
		CCTV ref2=new CCTV();
		System.out.println("default color:"+ref2.color);
		
		CCTV ref3=new CCTV();
		System.out.println("Actual color:"+ref3.colorr);
		
		System.out.println("End main in CCTVRunner");
		
	}
	
}