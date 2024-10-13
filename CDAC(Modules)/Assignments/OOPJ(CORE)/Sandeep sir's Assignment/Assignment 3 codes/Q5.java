import java.util.Scanner;

class TolBooth{
    int car;
    double carRate;
    int truck;
    double truckRate;
    int bus;
    double busRate;
    int bike;
    double bikeRate;
    int auto;
    double autoRate;
    int totalVehicles;
    void setTollRates(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Set Toll for car: ");
        this.carRate = sc.nextDouble();
        System.out.print("Set Toll for Truck: ");
        this.truckRate = sc.nextDouble();
        System.out.print("Set Toll for Bus: ");
        this.busRate = sc.nextDouble();
        System.out.print("Set Toll for Bike: ");
        this.bikeRate = sc.nextDouble();
        System.out.print("Set Toll for Auto: ");
        this.autoRate = sc.nextDouble();


    }

    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details Below :");

        System.out.println("Number of cars passed: ");
        this.car = sc.nextInt();
        this.totalVehicles+= this.car;
        System.out.println("Number of trucks passed: ");
        this.truck = sc.nextInt();
        this.totalVehicles+= this.truck;
        System.out.println("Number of bus passed: ");
        this.bus = sc.nextInt();
        this.totalVehicles+= this.bus;
        System.out.println("Number of bikes passed: ");
        this.bike = sc.nextInt();
        this.totalVehicles+= this.bike;
        System.out.println("Number of auto passed: ");
        this.auto = sc.nextInt();
        this.totalVehicles+= this.auto;

    }

    void calcRevenue(){
        double totalRevenue = (car*carRate)+(truck*truckRate)+(bus*busRate)+
                                (bike*bikeRate)+(auto*autoRate);

        System.out.println("Total Vehicles Passed: "+ this.totalVehicles);
        System.out.printf("Total Revenue Generated: %.2f" , totalRevenue);
    }
}


public class Q5 {
    public static void main(String[] args) {
        TolBooth toll = new TolBooth();
        toll.setTollRates();
        toll.acceptRecord();
        toll.calcRevenue();
    }
}
