package oop.assignment4.Q1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
	    LoanAmortizationCalculator lac = new LoanAmortizationCalculator();
	    	lac.acceptRecord();
	        lac.calculateMonthlyPayment();
	        lac.printRecord();
    }
}
