import java.util.Scanner;

class DiscountCalculator{
    double price;
    double discount;
    double discounted;
    double finalprice;
    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter discount %: ");
        this.discount = sc.nextDouble();
    }

    void calculateDiscount(){
         discounted = (price / 100)*discount;
         finalprice = price - discounted;

    }

    void printRecord(){
        System.out.printf("Discount: %.2f \n",discounted);
        System.out.printf("Final Amount: %.2f",finalprice);
    }

}

public class Q4 {
    public static void main(String[] args) {
        DiscountCalculator cal = new DiscountCalculator();
        cal.acceptRecord();
        cal.calculateDiscount();
        cal.printRecord();
    }
}
