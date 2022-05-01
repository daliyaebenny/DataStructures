package com.daliya;

import java.text.DecimalFormat;

public class CashRender {
	
	public StringBuffer change(String[] cashInput) {
		final DecimalFormat df = new DecimalFormat("0.00");
		StringBuffer change = new StringBuffer();
		float purchasePrice = Float.parseFloat(cashInput[0]);
		float cashRendered =  Float.parseFloat(cashInput[1]);
		if(cashRendered<purchasePrice){
		      return change.append("ERROR");
		    }else if (cashRendered ==purchasePrice){
		       return change.append("ZERO");
		    }  
		   
	   float changeToCustomer =Float.parseFloat(df.format(cashRendered - purchasePrice));
	    do{
	        
	        
	        if(changeToCustomer == 0.01)
	          change.append("PENNY");
	        else if (changeToCustomer ==0.05 )
	           change.append("NICKEL");
	        else if (changeToCustomer ==0.10 )
	           change.append("DIME");
	        else if (changeToCustomer ==0.25 )
	           change.append("QUARTER");
	        else if (changeToCustomer ==0.50 )
	           change.append("HALF DOLLAR");
	        else if (changeToCustomer ==1.00 )
	           change.append("DOLLAR");
	        else if (changeToCustomer ==2.00 )
	           change.append("TWO");
	        else if (changeToCustomer ==5.00 )
	           change.append("FIVE");
	        else if (changeToCustomer ==10.00 )
	           change.append("TEN");
	         else if (changeToCustomer ==20.00 )
	           change.append("TWENTY");
	        else if (changeToCustomer ==50.00 )
	           change.append("FIFTY");
	        else if (changeToCustomer ==100.00 )
	           change.append("ONE HUNDRED");
	          
	          changeToCustomer -= 0.01;
	          Math.round(changeToCustomer);
	        }while(changeToCustomer >= 0.00);
	        
	        if(changeToCustomer == 0.00)
	          change.append("ZERO");

         
		
		
		return change;
	}
	
public static void main(String args[]) {
	String input ="16.40;17.00";
	String[] cashInput = input.split(";");
	CashRender cR = new CashRender();
	System.out.println(cR.change(cashInput));

	}

}
