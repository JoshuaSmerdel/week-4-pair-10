package com.techelevator;

import java.math.BigDecimal;

public class Products {
	
	String productType = "";
	String productName;
	String slotId;
	BigDecimal price;
	int quantity = 5;
	
	public int getQuantity() 
	{
		return quantity;
	}

	public void purchase()
	{
		quantity --;
	}
	
	public String getProductName() {
		return productName;
	}
	public String getSlotId() {
		return slotId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	
	public Products(String productType, String productName, String slotId, BigDecimal price) {
        
		this.productName = productName;
        this.slotId = slotId;
        this.price = price;
        this.productType = productType;
    }
	
	public static String tummyTalk(String productType) {
		if (productType.equals("Chips")) {
			return "Crunch Crunch, Yum!";
		}else if (productType.equals("Drink")) {
			return "Glug Glug, Yum!";
		}else if (productType.equals("Candy")){
			return "Munch Munch, Yum!";
		}else {
			return "Chew Chew, Yum!";
		}

	}
}
