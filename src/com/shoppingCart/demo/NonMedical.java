package com.shoppingCart.demo;


public class NonMedical implements ItemElement  {
	
	
	private Integer price;
	private Integer weight=null;
	private String type;
	private String details;
	Integer count=null;
	public final   double tax=0.2;
	
	
	
	

	public NonMedical(NonMedicalBuilder builder) {
		super();
		this.price = builder.price;
		this.type = builder.type;
		this.details = builder.details;
		this.weight=builder.weight;
		this.count=builder.count;
	}
	
	
	

	public Integer getPrice() {
		return price;
	}


	

	public Integer getWeight() {
		return weight;
	}


	


	public String getType() {
		return type;
	}


	


	public String getDetails() {
		return details;
	}


	public Integer getCount() {
		return count;
	}


	




	public static class NonMedicalBuilder{
		
		private Integer price;
		private Integer weight;
		private String type;
		private String details;
		Integer count;
		
		
		public NonMedicalBuilder(Integer price, String type, String details) {
			super();
			this.price = price;
			this.type = type;
			this.details = details;
		}
		
		public NonMedicalBuilder setWeight(Integer weight) {
			this.weight=weight;
			return this;
		}
		
		public NonMedicalBuilder setCount(Integer count) {
			this.count=count;
			return this;
		}
		public NonMedical build() {
			return new NonMedical(this);
		}
		
		
	}


	@Override
	public double accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
