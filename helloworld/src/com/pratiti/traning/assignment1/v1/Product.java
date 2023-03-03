package com.pratiti.traning.assignment1.v1;

import java.util.Scanner;

public class Product {
	private String productName;
	private int productId;
	private String typeOfProduct;
	private int stock;
	private double price;
	private String description;
	
	public Product() {
		
	}
	
	public Product(String productName, int stock) {
		super();
		this.productName = productName;
		this.stock = stock;
	}
	
	public void calculateDiscount(int quantity) {
		if(this.typeOfProduct.equals("Book")) {
			if(this.stock >= quantity) {
				double totalPrice = quantity*(this.price);
				double discount = totalPrice/10;
				System.out.println("Discount is : "+discount);
			}
			else {
				System.out.println("Out of stock");
			}
		}
		
		if(this.typeOfProduct.equals("Toy")) {
			if(this.stock >= quantity) {
				System.out.println("Enter your age : ");
				Scanner sc = new Scanner(System.in);
				int age = sc.nextInt();
				if(age>=2 && age<4) {
					double totalPrice = quantity*(this.price);
					double discount = (totalPrice*15)/100; //750
					System.out.println("Discount is : "+discount);
				}
				else if(age>=4 && age<=5) {
					double totalPrice = quantity*(this.price);
					double discount = (totalPrice*5)/100; //250
					System.out.println("Discount is : "+discount);
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
	
	void display() {
		System.out.println("Details of product");
		System.out.println("Product name : "+productName);
		System.out.println("Product ID : "+productId);
		System.out.println("Product type : "+typeOfProduct);
		System.out.println("Stock in hand : "+stock);
		System.out.println("Product price : "+price);
		System.out.println("Product description : "+description);
		System.out.println("\n");
	}
	
	void updateDescription(String desc) {
		this.description = desc;
	}

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getTypeOfProduct() {
		return typeOfProduct;
	}

	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct = typeOfProduct;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	


	
	
}
