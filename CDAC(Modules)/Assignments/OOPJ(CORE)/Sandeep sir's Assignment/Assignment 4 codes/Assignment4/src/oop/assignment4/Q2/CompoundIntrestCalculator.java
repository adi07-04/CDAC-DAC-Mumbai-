package oop.assignment4.Q2;

import java.util.Scanner;

class CompoundInterestCalculator{
    double p;
    double r;
    int n;
    int t;
    

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

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	void  acceptRedord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        double principal = sc.nextDouble();
        setP(principal);
        
        System.out.print("Enter Annual Intrest Rate : ");
        double intrest = sc.nextDouble();
        setR(intrest);
        
        
        System.out.print("Number of times the interest is compounded per year : ");
        int numberoftimecompound = sc.nextInt();
        setT(numberoftimecompound);
        
        System.out.print("Enter Term : ");
        int term = sc.nextInt();
        setN(term);
        sc.close();

    }

    void calculateFutureValue(){
//        	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)

        double amount = this.p * Math.pow((1 + (this.r/100) / this.t), this.n * this.t);
        double intrestEarned = amount - p;

        System.out.printf("Total value after "+n+" years : %.2f \n",amount);
        System.out.printf("Intrest earned : %.2f",intrestEarned);
    }
}
