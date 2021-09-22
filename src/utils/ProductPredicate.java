package utils;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{
	public boolean test(Product t) {
		return t.getPrice() < 10;
	}
}
