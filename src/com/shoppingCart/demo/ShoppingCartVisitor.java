package com.shoppingCart.demo;


public interface ShoppingCartVisitor {
	
	double visit(Medical medicalItem);
	double visit (NonMedical nonMedicalItem);

}
