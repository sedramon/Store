package store;

import java.util.Date;

public class Clothes extends Product {
	public enum Size {XS, S, M, L, XL};
    private Size size;
    private String color;

    public Clothes(String size, String color, String name, String brand, double price) {
        super(name, brand, price);
        switch (size) {
        case "XS" :
        	this.size = Size.XS; break;
        case "S" :
        	this.size = Size.S; break;
        case "M" :
        	this.size = Size.M; break;
        case "L" :
        	this.size = Size.L; break;
        case "XL" :
        	this.size = Size.XL; break;
        }
        this.color = color;
        if (dayInTheWeek() != 1 || dayInTheWeek() != 2) {
            	discount = price * 0.1;
            	this.price -= discount;
        }
    }

	@Override
	public String toString() {
		return name + " " + brand + " " + size + " " + color;
	}
    
    

	

    
    
}
