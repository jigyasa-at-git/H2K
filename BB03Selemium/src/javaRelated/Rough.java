package javaRelated;

public class Rough {

	public String sColor;
	float fWidth;
	boolean bisAutoTransmission;
	int iNOFDoors;

	public void moveForward()	
	{	
		System.out.println("logic for moveforward");
	}	
		
	void moveBackward()	
	{	
		System.out.println("logic for movebackward");
	}	
		
	void start()	
	{	
		System.out.println("logic for start");
	}	
		
	void stop()	
	{	
		System.out.println("logic for stop");
	}	
	
	// CONSTRUCTOR examples:
	
	Rough (){
		
	}
	
	Rough (String sColorofTheCar){
		
	}
	
	Rough (String sColorofTheCar, boolean isThisTrue){
		
	}
		
	public static void main(String args[])	
	{	
		//<Class Name> <Object Name> = new <Constructor Name/Class name>();
		Rough oHonda = new Rough();
		oHonda.sColor = "White";
		
		oHonda.moveForward();
		oHonda.moveBackward();
		oHonda.start();
		oHonda.stop();
		
		//Rough oHonda = new Rough("Color");
		
	}	

	
}
