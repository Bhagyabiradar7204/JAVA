class Patient{
	Doctor doctor;
	String tablet;
	
	Patient(String tablet,Doctor doctor)
	{
		this.tablet=tablet;
		this.doctor=doctor;
	}
	public void display()
	{
		System.out.println("START display in Patient");
		System.out.println("tablet:"+this.tablet);
		doctor.details();

		
	}
	
}