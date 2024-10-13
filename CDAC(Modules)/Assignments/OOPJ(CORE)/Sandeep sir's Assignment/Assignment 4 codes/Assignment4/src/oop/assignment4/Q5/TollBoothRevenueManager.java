package oop.assignment4.Q5;

import java.util.Scanner;

public class TollBoothRevenueManager {
	 int car;
	 double carRate;
	 int truck;
	 double truckRate;
	 int bus;
	 double busRate;
	
	 
	 
	 
	public int getCar() {
		return car;
	}
	public void setCar(int car) {
		this.car = car;
	}
	public double getCarRate() {
		return carRate;
	}
	public void setCarRate(double carRate) {
		this.carRate = carRate;
	}
	public int getTruck() {
		return truck;
	}
	public void setTruck(int truck) {
		this.truck = truck;
	}
	public double getTruckRate() {
		return truckRate;
	}
	public void setTruckRate(double truckRate) {
		this.truckRate = truckRate;
	}
	public int getBus() {
		return bus;
	}
	public void setBus(int bus) {
		this.bus = bus;
	}
	public double getBusRate() {
		return busRate;
	}
	public void setBusRate(double busRate) {
		this.busRate = busRate;
	}
	
	public int totalVehicles() {
		return this.car+this.bus+this.truck;
	}
	
	public  double calcRevenue(){
        return  (this.car*this.carRate)+(this.truck*this.truckRate)+(this.bus*this.busRate);
    }
}
	
	
	 


