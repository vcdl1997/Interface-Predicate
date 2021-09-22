package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import utils.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Jumper Pct. 30 und", 5.90));
		products.add(new Product("Arduino Uno", 150.00));
		products.add(new Product("Arduino Mini", 100.00));
		products.add(new Product("Arduino Mega", 200.00));
		products.add(new Product("LED", 0.50));
		products.add(new Product("Resistor 300 Ohm", 0.80));
		
		products.removeIf(new ProductPredicate()); //utilizando classe que implemente interface predicate
		products.removeIf(p -> p.getPrice() < 10); //utilizando expressão lambda
		
		for(Product p : products) {
			System.out.println(p.getName() + ", " + p.getPrice());
		}
	}

}
