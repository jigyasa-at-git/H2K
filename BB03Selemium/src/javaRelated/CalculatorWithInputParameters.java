package javaRelated;

public class CalculatorWithInputParameters {

	
		int iOutput;
		
		void addition (int iInput1, int iInput2){
			
			iOutput = iInput1 + iInput2;
			
			System.out.println(iOutput);
		}
		
	void substratcion (int iInput1, int iInput2){
			
			iOutput = iInput1 - iInput2;
			
			System.out.println(iOutput);
		}

	void multiplication (int iInput1, int iInput2){
		
		iOutput = iInput1 * iInput2;
		
		System.out.println(iOutput);
	}

	void division (int iInput1, int iInput2){
		
		iOutput = iInput1 / iInput2;
		
		System.out.println(iOutput);
	}

	void getOrderNo (String sItemName){
		
			
		//System.out.println(iOutput);
	}
	
	public static void main (String args[]){
		
		CalculatorWithInputParameters oCalc = new CalculatorWithInputParameters();
		
		oCalc.addition(10,5);
		oCalc.substratcion(345, 214);
		oCalc.multiplication(983, 252);
		oCalc.division(1341, 235);
		oCalc.getOrderNo("Laptop");

	}

}
