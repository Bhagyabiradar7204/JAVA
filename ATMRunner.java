class ATMRunner{
	public static void main(String []args)
	{
		System.out.println("Start main in ATMRunner");
		
		ATM ref=new ATM();
		System.out.println("default shape:"+ref.shape);
		
		ATM ref1=new ATM();
		System.out.println("Actual shapee:"+ref1.shapee);
		
		ATM ref2=new ATM();
		System.out.println("default bankname:"+ref2.Bankname);
		
		ATM ref3=new ATM();
		System.out.println("Actual banknamee :"+ref3.Banknamee);
		
	    System.out.println("End main in ATMRunner");
		
	}
	
}