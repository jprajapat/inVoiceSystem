package com.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.master.Product;

public class InvoiceController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getConsoleInput();

	}
	 
	public static List<Product> getConsoleInput() {
		// TODO Auto-generated method stub
	    List<Product> productList = new ArrayList<>();
	    Product product = new Product();
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Product Name ");
	    product.setName(sc.next());

//	    System.out.println("enter Product type ");
//	    product.setProductType(sc.next());

	    System.out.println("Enter Product qty ");
	    product.setQuantity(sc.nextInt());

	    System.out.println(" Enter Product price ");
	    product.setPrice(sc.nextDouble());
	    
	    
	    System.out.println("Enter Product Name "+product.getName());
	    System.out.println("Enter Product Product Quality "+product.getQuantity());
	    System.out.println("Enter Product Price "+product.getPrice());
	    
	    productList.add(product);
	    return productList;
	    }
	
}
