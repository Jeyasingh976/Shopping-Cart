package com.shoppingCart.demo;


//Concrete observer
public class PriceObserver implements OrderObserver{

	@Override
	public void updated(Order order) {
		double cost = order.getItemCost();
		
		System.out.println("cost amount is"+cost);
	}

	
}
