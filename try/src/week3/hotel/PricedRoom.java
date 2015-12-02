package week3.hotel;

import week3.hotel.Bill.Item;

public class PricedRoom extends Room implements Bill.Item{
	private double roomPrice;
	private String description = "Room per night";


	public PricedRoom(int no, double roomPrice, double safePrice) {
		super(no, new PricedSafe(safePrice));
		this.roomPrice = roomPrice;
	}

	public double getAmount() {
		return roomPrice;
	}
	
public String toString(){
	return description + " €" + getAmount();

               }



			@Override
			public void add(Item item) {
				// TODO Auto-generated method stub
				
			}



			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}

}

