package com.coelhodev.desafio.services;

import org.springframework.stereotype.Service;

import com.coelhodev.desafio.pedidos.Order;


@Service
public class OrderService {

	Order order = new Order();
	ShippingService shippingService = new ShippingService();
	
	public double total(Order order) {
		return order.getBasic() + shippingService.shipment(order) - (order.getBasic() * order.getDiscount()/100);
	}
}
