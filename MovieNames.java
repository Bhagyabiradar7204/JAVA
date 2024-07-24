class MovieNames{
	public static void main(String [] args)
	{
		System.out.println("Start main in MovieNames");
		String movie1="Mission Mangal";
		String movie2="Om";
		String movie3="Yajamana";
		String movie4="Kalki";
		String movie5="Rajakumar";
		String movie6="Jogi";
		String movie7="Milana";
		String movie8="Appu";
		String movie9="Appu Pappu";
		String movie10="Ranna";
		String movie11="Habba";
		String movie12="Arasu";
		String movie13="Bettada Hoo";
		String movie14="Hudugaru";
		String movie15="Aptamitra";
		String movie16="Bettappa";
		String movie17="Tavarina Siri";
		String movie18="Anna Tangi";
		String movie19="Sita Rama";
		String movie20="Charli";
		
		String[] movie={movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movie11,movie12,movie13,movie14,movie15,movie16,movie17,movie18,movie19,movie20}; 
		
		for(int Name=0;Name<=20;Name++)
		{
			String ref=movie[Name];
			System.out.println("Movie :"+ref);
		}
		System.out.println("End main in MovieNames");
		
	}
}