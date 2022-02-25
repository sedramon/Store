package store;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Cashier {
	private ArrayList<Product> cart = new ArrayList<>();
	private double totalDiscount, totalPrice, totalPriceWithDiscount;
	private double qunatityFood, quantityBeverages, quantityClothes, quantityAppliances;
	private SimpleDateFormat sdf = new SimpleDateFormat();

	public void addToCart(Product p) {
		cart.add(p);
		if(p.getDiscount() != 0) {
			totalDiscount += p.getDiscount();
		}
		totalPrice += p.getPrice() + p.getDiscount();
		totalPriceWithDiscount = totalPrice - totalDiscount;
	}

	public void print() {
		System.out.println("Date: " + sdf.format(new Date()) + "\n\n");
		System.out.println("--Products--\n\n");
		for(int i = 0 ; i < cart.size() ; i++) {
			System.out.println(cart.get(i) + "\n");
			System.out.println("1 x " + cart.get(i).getPrice() + " = total\n " );
			if(cart.get(i).getDiscount() != 0) {
				System.out.printf("#discount %2.0f%s -$%2.2f\n\n",cart.get(i).getDiscountSize()*100,"%", cart.get(i).getDiscount());
			}
		}
		System.out.println("------------------------------");
		System.out.printf("SUBTOTAL: $%2.2f\n", totalPrice);
		System.out.printf("DISCOUNT: -$%2.2f\n", totalDiscount);
		System.out.printf("TOTAL: $%2.2f\n", totalPriceWithDiscount);
	}
}
