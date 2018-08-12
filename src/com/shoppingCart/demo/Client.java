package com.shoppingCart.demo;

public class Client {

    public static void main(String[] args) {
    	Order order = new Order("101");
    	PriceObserver price = new PriceObserver();
    	order.attach(price);
    	
    	QuantityObserver quant = new QuantityObserver();
    	order.attach(quant);
    	
    	
    	
 
    	
    
    		ItemElement[] items = new ItemElement[]{new Medical(20, "MED",1,"Para Tanblet 200 mg"),new Medical(100, "MED",2,"Injection"),
    				new NonMedical.NonMedicalBuilder(10, "Fruit", "Red Bananas").setWeight(1).build(),
    				new NonMedical.NonMedicalBuilder(10, "Pen", "Renault Pen").setCount(1).build()};
    		
    		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
    		double sum=0;
    		for(ItemElement item : items){
    			sum = item.accept(visitor);
    			order.addItem(sum);
    		}
    		
    		
    	
    	System.out.println(order);
    }
}
