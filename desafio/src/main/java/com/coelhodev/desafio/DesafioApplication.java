package com.coelhodev.desafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coelhodev.desafio.pedidos.Order;
import com.coelhodev.desafio.services.OrderService;
import com.coelhodev.desafio.services.ShippingService;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		SpringApplication.run(DesafioApplication.class, args);
		
		System.out.print("Codigo: ");
		int code = sc.nextInt();
		
		System.out.print("Valor Basico:   ");
		double basic = sc.nextDouble();
		
		System.out.print("Valor Desconto:   ");
		double discount = sc.nextDouble();
		
		
		Order order = new Order(code, basic, discount);
		OrderService orderService = new OrderService();
		
		double total = orderService.total(order);
		
		System.out.print(" Codigo:  " + code);
		System.out.print(" Total:  " + total);
		
		sc.close();
	}
	


	@Override
	public void run(String... args) throws Exception {
			

	
	}

}
