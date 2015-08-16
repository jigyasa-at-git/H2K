package javaRelated;

public class Car {

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
		
	public static void main(String args[])	
	{	
		//<Class Name> <Object Name> = new <Constructor Name/Class name>();
		Car oHonda = new Car();
		oHonda.sColor = "White";
		
		oHonda.moveForward();
		oHonda.moveBackward();
		oHonda.start();
		oHonda.stop();
		
	}	

	
}
