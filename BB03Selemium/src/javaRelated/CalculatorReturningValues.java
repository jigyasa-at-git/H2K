package javaRelated;

public class CalculatorReturningValues {

	
		int iOutput;
		
		int addition (int iInput1, int iInput2){
			
			iOutput = iInput1 + iInput2;
						System.out.println(iOutput);
			return iOutput;
		}
		
	int substratcion (int iInput1, int iInput2){
			
			iOutput = iInput1 - iInput2;
			
			System.out.println(iOutput);
			return iOutput;

		}

	int multiplication (int iInput1, int iInput2){
		
		iOutput = iInput1 * iInput2;
		
		System.out.println(iOutput);
		return iOutput;

	}

	int division (int iInput1, int iInput2){
		
		iOutput = iInput1 / iInput2;
		System.out.println(iOutput);
		return iOutput;

	}

	String getOrderNo (String sItemName){
		
			
		//System.out.println(iOutput);
		return sItemName;
	}
	
	boolean isDigitalCalc(){
		
		return true;
		
	}
	
	public static void main (String args[]){
		
		CalculatorReturningValues oCalc = new CalculatorReturningValues();
		
		oCalc.addition(10,5);
		oCalc.substratcion(345, 214);
		oCalc.multiplication(983, 252);
		oCalc.division(1341, 235);
		oCalc.getOrderNo("Laptop");

	}

}
