package com.coelhodev.desafio.services;

import org.springframework.stereotype.Service;

import com.coelhodev.desafio.pedidos.Order;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic;

@Service
public class ShippingService {
	
	Order order = new Order();
	double frete =0;
	
	public double shipment (Order order) {
		
		
		if (order.getBasic() < 100) {
			frete = 20.0;
			}
		
		if(order.getBasic() >= 100 &&  order.getBasic() <  200) {
			frete = 12.0;
			} 
		
		if(order.getBasic() >=200) {
			frete = 0;
			}
		
	return frete;
		
	}
	
}
