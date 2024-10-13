package oop.assignment4.Q4;

import java.util.Scanner;

public class DiscountCalculatorUtil {
	private double price;
	private  double discount;
	private double discounted;
	private double finalprice;
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscounted() {
		return discounted;
	}

	public void setDiscounted(double discounted) {
		this.discounted = discounted;
	}

	public double getFinalprice() {
		return finalprice;
	}

	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}
	

	void acceptRecords() {
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Price: ");
	        price = sc.nextDouble();
	        setPrice(price);
	        System.out.print("Enter discount %: ");
	        discount = sc.nextDouble();
	        setDiscount(discount);
		
	}
	
	void calculateDiscount(){
        discounted = (getPrice() / 100)*getDiscount();
        setDiscounted(discounted);
        finalprice = getPrice() - getDiscounted();
        setFinalprice(finalprice);

   }
	
	void printRecords() {
		 System.out.printf("Discount: %.2f \n",getDiscounted());
	     System.out.printf("Final Amount: %.2f",getFinalprice());
	}
    
    

}
