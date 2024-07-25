class StateName{
	public static void main(String [] args)
	{
		System.out.println("Start main in StateName");
		String state1="Jammu and Kashmir";
		String state2="Arunachal Pradesh";
		String state3="Assam";
		String state4="Bihar";
		String state5="Himachal pradesh";
		String state6="Goa";
		String state7="Karnataka";
		String state8="kerala";
		String state9="Tamilnadu";
		String state10="Odisha";
		String state11="Meghalaya";
		String state12="Manipur";
		String state13="Andhra Pradesh";
		String state14="Telangana";
		String state15="Gujarath";
		String state16="West Bangal";
		String state17="Uttar Pradesh";
		String state18="Nagaland";
		String state19="Chattisgarh";
		String state20="Punjab";
		String state21="Rajasthan";
		String state22="Maharashtra";
		String state23="Jharkhand";
		String state24="Madhya Pradesh";
		String state25="Sikkim";
		String state26="Tripura";
		String state27="Haryana";
		String state28="Uttarakhand";
		
		String[] state={state1,state2,state3,state4,state5,state6,state7,state8,state9,state10,state11,state12,state13,state14,state15,state16,state17,state18,state19,state20,state21,state22,state23,state24,state25,state26,state27,state28}; 
		
		for(int Name=state.length-1;Name>=0;Name--)
		{
			String ref=state[Name];
			System.out.println("state :"+ref);
		}
		System.out.println("End main in StateName");
		
	}
}