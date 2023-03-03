package com.pratiti.traning.assignment1.v2;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
//		Product p1 = new Book();
//		p1.setData("Wings of Fire",101,"Book",50,500,"Wings of Fire (1999), is the autobiography of the Missile Man of India and President of India, Dr. A. P. J. Abdul Kalam.");
//		p1.display();
//		
//		
//		Product p2 = new Toy();
//		p2.setData("Toy Car",100,"Toy",100,700,"Best Made In India Games Ideal birthday gifts for kids of age 3 years and above.");
//		p2.display();
//		
//		p1.updateDescription("The 'Wings of Fire' is one such autobiography by visionary scientist Dr. APJ Abdul Kalam, who from very humble beginnings rose to be the President of India.");
//		p1.display();
//
//		p1.calculateDiscount(60);
//		p1.calculateDiscount(20);
//		
//		p2.calculateDiscount(5);
		Scanner sc = new Scanner(System.in);
		Product[] p = new Product[10];
		int index=0;
		for(int i=0;i<1;i++) {
			System.out.println("Enter product name : ");
			String name = sc.nextLine();
			System.out.println("Enter product id : ");
			int id = sc.nextInt();
			System.out.println("Enter product type : ");
			String type = sc.next();
			System.out.println("Enter product quatity : ");
			int quantity = sc.nextInt();
			System.out.println("Enter product price : ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter product description : ");
			String desc = sc.nextLine();
			if(type.equals("Book")) {
				p[i] = new Book(name, id, type, quantity, price, desc);
			}
			else {
				System.out.println("Enter age : ");
				int age = sc.nextInt();
				p[i] = new Toy(name, id, type, quantity, price, desc,age);
			}
			index++;
		}
		for(int i=0;i<index;i++) {
			p[i].display();
		}
		
		System.out.println("Enter 1 - Change the description \n2 - Order a product");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
			case 1: 
				System.out.println("Enter product name : ");
				String productName = sc.nextLine();
				int flag=0;
				for(int i=0;i<index;i++) {
					if(p[i].getProductName().equals(productName)) {
						System.out.println("Enter new product description : ");
						String s = sc.nextLine();
						p[i].updateDescription(s);
						p[i].display();
						flag=1;
					}
				}
				if(flag==0) {
					System.out.println("No such product");
				}
				break;
			case 2:
				System.out.println("Enter product name : ");
				String orderProductName = sc.nextLine();
				int f=0;
				for(int i=0;i<index;i++) {
					if(p[i].getProductName().equals(orderProductName)) {
						System.out.println("Enter quantity to order : ");
						int q = sc.nextInt();
						p[i].calculateDiscount(q);
						f=1;
					}
				}
				if(f==0) {
					System.out.println("No such product");
				}
				break;
			default:
				System.out.println("Enter valid choice");
		}
	}

}
