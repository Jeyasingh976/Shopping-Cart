package com.shoppingCart.demo;


public class Medical implements ItemElement {

	
	
	private int price;
	private String type;
	private int count;
	private String details;
	
	
	
	
	public Medical(int price, String type, int count,String details) {
		super();
		this.price = price;
		this.type = type;
		this.count = count;
		this.details=details;
	}

	


	public String getDetails() {
		return details;
	}




	public void setDetails(String details) {
		this.details = details;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}




	@Override
	public double accept(ShoppingCartVisitor visitor) {
		
		
		return visitor.visit(this);
	}

}
