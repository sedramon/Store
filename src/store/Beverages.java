package store;

import java.util.Calendar;
import java.util.Date;

public class Beverages extends Product{
	Date expirationDate;
    Calendar expDate = Calendar.getInstance();
    
	public Beverages(int yearExp, int monthExp, int dayExp, String name, String brand, double price) {
		super(name, brand, price);
		this.expirationDate = setExpirationDate(expDate, yearExp, monthExp, dayExp);
        if(daysBetween(expirationDate, manufacturedAt) <= 0) {
        	discountSize = 0.7;
            discount = price * discountSize;
            this.price -= discount;
        } else if (daysBetween(expirationDate, manufacturedAt) <= 5) {
        	discountSize = 0.3;
            discount = price * discountSize;
            this.price -= discount;
        }
		
	}
	
	public Date getExpirationDate() {
        return expirationDate;
    }


	
}
