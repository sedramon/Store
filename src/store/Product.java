package store;

import java.util.Calendar;
import java.util.Date;

public abstract class Product {
	
    protected String name, brand;
    protected Date manufacturedAt;
    protected Calendar dayInWeek = Calendar.getInstance();
    protected double discount, price, discountSize;

    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.manufacturedAt = Calendar.getInstance().getTime();
        this.price = price;
    }

    protected long daysBetween(Date one, Date two) {
        long difference = (one.getTime() - two.getTime()) / 86400000;
        return difference;
    }
    
    protected Date setExpirationDate(Calendar expDate, int year, int month, int day) {
        expDate.set(year, month-1, day);
        Date d = expDate.getTime();
        return d;
    }
    
    protected int dayInTheWeek() {
        int n = dayInWeek.get(dayInWeek.DAY_OF_WEEK);
        return n;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDiscount() {
        return discount;
    }
    
    public double getDiscountSize() {
        return discountSize;
    }
    
    public Date getManufacturedAt() {
        return manufacturedAt;
    }

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + brand;
	}
	
	
    
    
	
}
