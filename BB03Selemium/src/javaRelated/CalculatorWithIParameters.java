package javaRelated;

public class CalculatorWithIParameters {

	int iOutPut;
	
	void addition(int iInput1, int iInput2)
	{
		iOutPut = iInput1 + iInput2;
		System.out.println(iOutPut);
	}

	void substraction(int iInput1, int iInput2)
	{
		iOutPut = iInput1 - iInput2;
		System.out.println(iOutPut);
	}
	
	void multiplication(int iInput1, int iInput2)
	{
		iOutPut = iInput1 * iInput2;
		System.out.println(iOutPut);
	}
	
	void division(int iInput1, int iInput2)
	{
		iOutPut = iInput1 / iInput2;
		System.out.println(iOutPut);
	}
		
	void getOrderNo(String sItemName)
	{
		
	}
	
	public static void main(String args[])
	{
		CalculatorWithIParameters oCalc = new CalculatorWithIParameters();
		
		oCalc.addition(10,5);	//10, 5
		oCalc.substraction(345, 214);	//345, 214
		oCalc.multiplication(983, 252);	//983, 252
		oCalc.division(1341, 235);	//1341, 235
		oCalc.getOrderNo("laptop");
		
	}

}
