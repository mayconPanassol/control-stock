package entities;

import java.text.Format;

public class Product {

	String name;
	double price;
	int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueStock() {
		return quantity;
	}

	public void addProduct(int quantity) {
		this.quantity += quantity;
	}

	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Product data: " + name + ", $ " + price + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", price * quantity);

	}
}
