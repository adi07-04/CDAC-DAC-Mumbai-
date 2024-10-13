package oop.assignment4.Q1;

import java.util.Scanner;

public class LoanAmortizationCalculator {
	 	private double p ;
	 	private double r;
	 	private double n;
	 	private double monthlyPayment;
	 	private double amountPaidOverLoan;
	    
	  
		public double getP() {
			return p;
		}

		public void setP(double p) {
			this.p = p;
		}

		public double getR() {
			return r;
		}

		public void setR(double r) {
			this.r = r;
		}

		public double getN() {
			return n;
		}

		public void setN(double n) {
			this.n = n;
		}



		void acceptRecord() {
			
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Principal Amount: ");
		        double principal = sc.nextDouble();
		        setP(principal);
		        
		        System.out.println("Enter Intrest Rate : ");
		        double intrest = sc.nextDouble();
		        setR(intrest);
		        
		        System.out.println("Enter Term : ");
		        double term = sc.nextDouble();
		        setN(term);
		}



		void  calculateMonthlyPayment(){
	        double monthlyIntrestRate = r/(12*100);
	        int numberOfMonths =(int) n*12;

	         monthlyPayment = p*(monthlyIntrestRate * Math.pow((1+monthlyIntrestRate),numberOfMonths) )
	                                 / ( Math.pow(1+monthlyIntrestRate,numberOfMonths)-1);

	         amountPaidOverLoan = (monthlyPayment*numberOfMonths) + p;
	    }
		
		void printRecord() {
			 System.out.printf("Monthly payment: %.2f \n", monthlyPayment);
			 System.out.printf("Total amount paid over the life of the loan :%.2f ", amountPaidOverLoan);
		}
}
