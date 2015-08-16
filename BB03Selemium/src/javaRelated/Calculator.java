package javaRelated;

public class Calculator {

	int iInput1, iInput2, iOutPut;
	
	void addition()
	{
		iOutPut = iInput1 + iInput2;
		System.out.println(iOutPut);
	}

	void substraction()
	{
		iOutPut = iInput1 - iInput2;
		System.out.println(iOutPut);
	}
	
	void multiplication()
	{
		iOutPut = iInput1 * iInput2;
		System.out.println(iOutPut);
	}
	
	void division()
	{
		iOutPut = iInput1 / iInput2;
		System.out.println(iOutPut);
	}
	
	public static void main(String args[])
	{
		Calculator oCalc = new Calculator();
		
		oCalc.iInput1 = 10;
		oCalc.iInput2 = 5;
		
		oCalc.addition();	//10, 5
		oCalc.substraction();	//345, 214
		oCalc.multiplication();	//983, 252
		oCalc.division();	//1341, 235
	}
}
