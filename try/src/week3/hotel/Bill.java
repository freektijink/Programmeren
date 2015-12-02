package week3.hotel;

import java.io.PrintStream;

import week3.hotel.Bill.Item;

public class Bill {
	
	private PrintStream output;
	private double totalPrice;
	
	public static interface Item{
		public double getAmount();

		void add(Item item);

		String getDescription();

		
	}
	
	public Bill(PrintStream outStream){
			this.output = outStream;
			this.totalPrice = 0;
	}
	
	public void newItem(PricedRoom room){
	if (room != null)	;
		double price = room.getAmount();
		this.totalPrice += price;
	if (output != null)	;
		this.output.format("%-30.30s  %-30.30s%n", "Item Added:", price);
	}
	
	public void newItem(PricedSafe safe){
		if (safe != null)	;
			double price = safe.getAmount();
			this.totalPrice += price;
		if (output != null)	;
			this.output.format("%-30.30s  %-30.30s%n", "Item Added:", price);
		}
	public void newItem(Item item){
		if (item != null)	;
			double price = item.getAmount();
			this.totalPrice += price;
		if (output != null)	;
			this.output.format("%-30.30s  %-30.30s%n", "Item Added:", price);
		}
	
	public void close(){
		this.output.format("%-30.30s  %-30.30s%n", "Total:", this.getSum());
	}
	
	public double getSum(){
		return this.totalPrice;
	}


	
	
	
}
