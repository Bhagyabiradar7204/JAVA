class Rocket{
	
	String country="India";
	double speed;
	double fuelCapacity;
	double noOfThrusters;
	
	Rocket(double speed)
	{
		System.out.println("created speed");
		this.speed=speed;
	}
	
	public void SetfuelCapacity(double fuelCapacity)
	{
		System.out.println("created fuelCapacity");
		this.fuelCapacity=fuelCapacity;
	}
	
	public static void main(String [] args)
	{
		System.out.println("start runing in main");
		
		Rocket rocket = new Rocket(3);
		rocket.SetfuelCapacity(10000);
		rocket.noOfThrusters=5;
		System.out.println("FuelCapacity : " + rocket.fuelCapacity);
		System.out.println("Country :" + rocket.country);
		System.out.println("Speed :" + rocket.speed);
		System.out.println("NoofThursters:"+rocket.noOfThrusters);
		
		
		Rocket rocket1 = new Rocket(5);
		rocket1.SetfuelCapacity(2097);
		rocket1.noOfThrusters=6;
		System.out.println("FuelCapacity : " + rocket1.fuelCapacity);
		System.out.println("Country :" + rocket1.country);
		System.out.println("Speed :" + rocket1.speed);
		System.out.println("NoofThursters:"+rocket1.noOfThrusters);
		
		Rocket rocket2 = new Rocket(10);
		rocket2.SetfuelCapacity(4018);
		rocket2.noOfThrusters=7;
		System.out.println("FuelCapacity : " + rocket2.fuelCapacity);
		System.out.println("Country :" + rocket2.country);
		System.out.println("Speed :" + rocket2.speed);
		System.out.println("NoofThursters:"+rocket2.noOfThrusters);
		
		System.out.println("end runing in main");
		
		
	}
}
