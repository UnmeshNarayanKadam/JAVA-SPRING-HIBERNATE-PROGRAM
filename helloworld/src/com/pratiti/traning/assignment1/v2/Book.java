package com.pratiti.traning.assignment1.v2;

public class Book extends Product{
	
	public Book(String productName, int productId, String typeOfProduct, int stock, double price,
			String description) {
		this.setDescription(description);
		this.setPrice(price);;
		this.setStock(stock);;
		this.setProductId(productId);
		this.setProductName(productName);
		this.setStock(stock);
		this.setTypeOfProduct(typeOfProduct);
	}
	
	public void calculateDiscount(int quantity) {
		if(this.getStock() >= quantity) {
			double totalPrice = quantity*(this.getPrice());
			double discount = totalPrice/10;
			System.out.println("Price is : "+(totalPrice-discount));
		}
		else {
			System.out.println("Out of stock");
		}
	}

}
