package week3.hotel;

import week3.hotel.Bill.Item;

public class BillItem implements Bill.Item{ 
	public double amount;
	public String description;
		
	public BillItem(double amoun, String desc){
		
		amount = amoun;
		description = desc;
	}
		
		 
 	public double getAmount() { 
 		// Voeg actuele prijs toe
 		return amount ; 
  	} 
 	
 	public String getDescription() { 
		return description; 
	}
 	
 	
 	
 	public String toString(){
 		return description;
 	}


	@Override
	public void add(Item item) {
		// TODO Auto-generated method stub
		
	}

}
