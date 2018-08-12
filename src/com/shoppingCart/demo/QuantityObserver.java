package com.shoppingCart.demo;


public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        int count = order.getCount();
       
    }
}
