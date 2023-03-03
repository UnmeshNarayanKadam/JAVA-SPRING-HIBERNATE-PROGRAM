package com.pratiti.traning.assignment1.v2;

import java.util.Scanner;

public class Toy extends Product {
	private int age;
	public Toy(String productName, int productId, String typeOfProduct, int stock, double price,
			String description,int age) {
		this.setDescription(description);
		this.setPrice(price);;
		this.setStock(stock);;
		this.setProductId(productId);
		this.setProductName(productName);
		this.setStock(stock);
		this.setTypeOfProduct(typeOfProduct);
		this.age=age;
	}

	
	public void calculateDiscount(int quantity) {
		if(this.getStock() >= quantity) {
			if(this.age>=2 && this.age<4) {
				double totalPrice = quantity*(this.getPrice());
				double discount = (totalPrice*15)/100; //750
				System.out.println("Price is : "+(totalPrice-discount));
			}
			else if(this.age>=4 && this.age<=5) {
				double totalPrice = quantity*(this.getPrice());
				double discount = (totalPrice*5)/100; //250
				System.out.println("Price is : "+(totalPrice-discount));
			}
			else {
				System.out.println("No discount");
			}
		}
		else {
			System.out.println("Out of stock");
		}
		
	}
}
