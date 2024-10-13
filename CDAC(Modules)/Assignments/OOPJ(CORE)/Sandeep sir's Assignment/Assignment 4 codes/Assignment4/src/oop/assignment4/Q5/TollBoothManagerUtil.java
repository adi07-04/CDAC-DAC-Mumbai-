package oop.assignment4.Q5;

import java.util.Scanner;

public class TollBoothManagerUtil {
	static TollBoothRevenueManager manager = new TollBoothRevenueManager();
	static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord() {
		System.out.println("Number of cars passed: ");
		int carspassed = sc.nextInt();
		manager.setCar(carspassed);
		
		System.out.println("Number of trucks passed: ");
		int truckspassed = sc.nextInt();
		manager.setTruck(truckspassed);
		
		System.out.println("Number of bus passed: ");
		int Buspassed = sc.nextInt();
		manager.setBus(Buspassed);
		
	}
	
	public static void setTollRates(){
	      
	      
	      System.out.print("Set Toll for car: ");
	      double carRate = sc.nextDouble();
	      manager.setCarRate(carRate);
	      
	     
	      System.out.print("Set Toll for Truck: ");
	      double truckRate = sc.nextDouble();
	      manager.setTruckRate(truckRate);
	      
	      
	      System.out.print("Set Toll for Bus: ");
	      double busRate = sc.nextDouble();
	      manager.setBusRate(busRate);    
	
  }
	
	public static void printRecord() {
			System.out.println("Total Vehicles: "+ manager.totalVehicles());
			System.out.println("Total Revenue : "+ manager.calcRevenue());
	}
	
	public static void menuList() {
        System.out.println("1. Set Toll Rates");
        System.out.println("2. Accept Vehicle Records");
        System.out.println("3. Display Total Revenue and Vehicle Count");
        System.out.println("4. Exit");
    }
}
