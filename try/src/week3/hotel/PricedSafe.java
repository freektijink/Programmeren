package week3.hotel;

import week3.hotel.Bill.Item;

public class PricedSafe extends Safe implements Bill.Item { 
	private double price = 15.00; 
	
	public String description = "A safe that has to be paid for."; 
	
	public PricedSafe(double price) { 
	this.price = price; 
	} 
		 
	public double getAmount() { 
		return price; 
	} 
		 
	public String toString() { 
		String output = ""; 
		output += " Active: " + Boolean.toString(this.isActive()); 
		output += "  Open: " + Boolean.toString(isOpen()); 
		output += " Price: " + Double.toString(price); 
		output += "Description: " + description; 
		return output; 
	}	 
			 
	public String getDescription() { 
		return description; 
	}

	@Override
	public void add(Item item) {
		// TODO Auto-generated method stub
		
	} 
	 
	} 
