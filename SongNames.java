class SongNames{
	public static void main(String [] args)
	{
		System.out.println("Start main in SongNames");
		String song1="Araluva hoogake";
		String song2="Banadariyalli soorya jari hoda";
		String song3="Appa i love you";
		String song4="Enagali munde sagu nee ";
		String song5="Onde usirante";
		String song6="love me like you do";
		String song7="yeh raatein yeh mussam";
		String song8="Hum saath saath hain";
		String song9="Agar tum mil jao";
		String song10="Tum se hi";
		
		
		String[] song={song1,song2,song3,song4,song5,song6,song7,song8,song9,song10}; 
		
		for(int Name=0;Name<10;Name++)
		{
			String ref=song[Name];
			System.out.println("Song :"+ref);
		}
		System.out.println("End main in SongNames");
		
	}
}