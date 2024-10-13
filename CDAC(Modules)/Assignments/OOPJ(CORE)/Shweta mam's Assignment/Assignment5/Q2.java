class Vehicle{
    String manufacturer;
    int Year;

    Vehicle(String maker, int year){
        this.manufacturer = maker;
        this.Year = year;
    }
    void details(){}
}
class Car extends Vehicle{
    String model;
    double price;

    Car(String manufacturer,int year,String model,double price){
        super(manufacturer,year);
        this.model = model;
        this.price = price;
    }

    void details(){
        System.out.println("Manufacturer: "+this.manufacturer);
        System.out.println("Year: "+this.Year);
        System.out.println("Model: "+this.model);
        System.out.println("Price: "+this.price);
    }

}


public class Q2 {
    public static void main(String[] args) {
        Vehicle car = new Car("TATA",2024,"Harrier",2500000);
        car.details();
    }
}
