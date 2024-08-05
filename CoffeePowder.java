class CoffeePowder{
	double cost;
	String company;
	double weight;//in kg
	double manfdate;
	
	CoffeePowder()
	{
		
	}
	
	CoffeePowder(String company){
		this.company=company;
	}
	
    CoffeePowder(String company,double cost,double weight,int manfdate){
		this.company=company;
		this.cost=cost;
		this.weight=weight;//in kg
		this.manfdate=manfdate;
	}
	
	CoffeePowder(String company,int manfdate){
		this.company=company;
		this.manfdate=manfdate;
	}
	CoffeePowder(double weight){
		this.weight=weight;//in kg
	}
	
}
