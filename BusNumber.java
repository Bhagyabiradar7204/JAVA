class BusNumber{
	public static void main(String [] args)
		{
			System.out.println("start main in busnumber");
			
			String b1="401k";
			String b2="317A";
			String b3="600F";
			String b4="252F";
			String b5="296A";
			
			String[] TotalBusno={b1,b2,b3,b4,b5};
			
			for(int begin=TotalBusno.length-1;begin>=0;begin--)
			{
				System.out.println("TOTALBUSNO:"+TotalBusno[begin]);
			}
			
			System.out.println("TOTALBUSNO:"+TotalBusno.length);
			System.out.println("end main in busnumber");


		}
}