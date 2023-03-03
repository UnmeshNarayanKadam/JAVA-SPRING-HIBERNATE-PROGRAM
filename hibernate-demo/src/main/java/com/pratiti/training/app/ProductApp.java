package com.pratiti.training.app;

import java.util.List;

import com.pratiti.training.dao.ProductDao;
import com.pratiti.training.entity.Product;

public class ProductApp {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();

//		Product pd1 = new Product();
//		pd1.setName("Rdemi c6");
//		pd1.setPrice(12000);
//		pd1.setQuantity(19);
//		dao.add(pd1);

//Fetch by id
//		Product pd2 = dao.fetch(7);
//		System.out.println(pd2.getName()+" "+pd2.getPrice()+" "+pd2.getQuantity());

//Fetch all product
//		List<Product>list = dao.fetchAll();
//		for(Product p : list) {
//			System.out.println(p.getName()+" "+p.getPrice()+" "+p.getQuantity());
//		}

//fetch by price
//		List<Product>list = dao.fetchByPrice(50000);
//		for(Product p : list) {
//			System.out.println(p.getName()+" "+p.getPrice()+" "+p.getQuantity());
//		}

//Fetch by name
//		List<Product> list = dao.fetchByName("Rdemi");
//		for (Product p : list) {
//			System.out.println(p.getName() + " " + p.getPrice() + " " + p.getQuantity());
//		}
	
//Update
//		Product pd3 = dao.fetch(7);
//		pd3.setPrice(pd3.getPrice()-pd3.getPrice()*0.10);
//		dao.Update(pd3);
		
//delete
		dao.delete(8);
		
	}

}
