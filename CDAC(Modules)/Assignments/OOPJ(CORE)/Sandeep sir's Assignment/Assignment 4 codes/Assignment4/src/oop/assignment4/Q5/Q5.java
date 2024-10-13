package oop.assignment4.Q5;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		TollBoothRevenueManager manager = new TollBoothRevenueManager();

		int choice;
		do {
			TollBoothManagerUtil.menuList();
			Scanner sc = new Scanner(System.in);
			 choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				TollBoothManagerUtil.setTollRates();
				break;
			case 2:
				TollBoothManagerUtil.acceptRecord();
				break;
			case 3:
				manager.calcRevenue();
				manager.totalVehicles();
				TollBoothManagerUtil.printRecord();
			case 4:
				break;
				
			default:
				System.out.println("Enter valid value");
				
				
		}
			
	}while(choice != 4);
}}
