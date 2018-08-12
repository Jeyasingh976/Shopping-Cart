package com.shoppingCart.demo;


public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public double visit(Medical medical) {
		double cost=0;
		 cost = medical.getPrice()*medical.getCount();
		System.out.println("Medical Details is ::"+medical.getDetails() + " cost ="+cost);
		return cost;
	}


	@Override
	public double visit(NonMedical nonMedical) {
		double cost=0;
		
		if(nonMedical.getWeight()!=null)
		{
			cost=nonMedical.getPrice()*nonMedical.getWeight();
			System.out.println(nonMedical.getType()+" Details is ::"+nonMedical.getDetails() + " cost ="+cost);
					cost=cost+cost*nonMedical.tax;
					System.out.println("Item Tax amount is "+cost*nonMedical.tax);
		}
			
		
		else if(nonMedical.getCount()!=null ){
			
			System.out.println(nonMedical.getType()+" Details is ::"+nonMedical.getDetails() + " cost ="+cost);
			cost=nonMedical.getPrice()*nonMedical.getCount();
					cost=cost+cost*nonMedical.tax;
					System.out.println("Item Tax amount is "+cost*nonMedical.tax);
		}
			
		return cost;
	}


}
