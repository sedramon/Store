package store;

import store.Clothes.Size;

public class Store {
	public static void main(String[] args) {
        Cashier c = new Cashier();
        c.addToCart(new Food(2022, 2, 28, "Chips", "Pringles", 3));
        c.addToCart(new Beverages(2022, 2,28, "Drink", "Coke", 6));
        c.addToCart(new Clothes("XL", "Red", "Pants", "Amiri", 15));
        c.addToCart(new Appliances(30, "Laptop", "Lenovo", 300, "ZX-1234"));
        c.print();
	}
}
