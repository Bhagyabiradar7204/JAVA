class PatientRunner{
	public static void main(String []args)
	{
		System.out.println("Start main in PatientRunner");
		Doctor doctor=new Doctor("Hema","JSS");
		
		Patient patient=new Patient("dolo",doctor);
		patient.display();
		System.out.println("End main in PatientRunner");
	}
}