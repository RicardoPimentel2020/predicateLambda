package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));
		
		//list.removeIf(x -> x.getPrice() >= 100); remove produto maior que 100
		
		///list.removeIf(new ProductPredicate());// instanciando class que faz a mesma funçaõ remove > 100
		
	//	list.removeIf(Product:: staticProductPredicate); metodo static criado na class Product mesma funcao
		
	//	list.removeIf(Product:: nonstaticProductPredicate);metodo não static utiliza parametro da class price 
		
		//Expressão Lambda 
		double min = 100.0;
		//Lambda Declarada 
		//Predicate<Product> pred = p -> p.getPrice() >= min;// 
	//	list.removeIf(red);
		
		//Lambda online
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
