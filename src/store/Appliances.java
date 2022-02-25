package store;

import java.util.Calendar;
import java.util.Date;

public class Appliances extends Product{
	private String model;
    private double weigth;

    public Appliances(double weigth, String name, String brand, double price, String model) {
        super(name, brand, price);
        this.model = model;
        this.weigth = weigth;
        if (price > 999 && dayInTheWeek() == 1 || dayInTheWeek() == 7 ) {
        	discount = price * 0.07;
        	price -= discount;
        }
    }

	@Override
	public String toString() {
		return name + " " + brand + " " + model;
	}

}
