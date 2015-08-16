package javaRelated;

import org.junit.Test;

public class JavaLoops {
	
	//@Test
	public void exForIfLoop(){
		String sState = "CA";
		
		if(sState == "CA"){
			
			System.out.println("imposed 22% - If Condition");
		}		
	}
	
	//@Test
	public void exForIfElseLoop(){
		String sState = "NJ";
		
		if(sState == "CA"){
			
			System.out.println("imposed 22% - If-Else Condition");
			
		}
		
		else{
			System.out.println("imposed 25% - If-Else Condition");
			
		}
	}
	
	//@Test
	public void exForNestedIfElseLoop(){
		String sState = "NJ";
		
		if(sState == "CA"){
			
			System.out.println("imposed 22% - Nested IF  Condition");
					
		}

		else if(sState == "NJ"){
			System.out.println("imposed 25% - Nested else IF  Condition");
			
		}
		
		
	}
	
	//@Test
	public void exForNestedIfLoop(){
		String sState = "NJ";
		
		if(sState == "CA"){
			
			System.out.println("imposed 22% - If-Else Condition");
			
		}
		
		else{
			System.out.println("imposed 25% - If-Else Condition");
			
		}
	}
	
	
	public void exForSwitchLoop(){
		
		String sKey = "StringOne";
		
/*	switch cKey(){
	
	
	}
*/	
		
	}
	
	
	
	
	
	
	
	

}
