import java.util.Scanner;

class CompoundInterestCalculator{
    double p;
    double r;
    int n;

    int t;

    void  acceptRedord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        this.p = sc.nextDouble();
        System.out.print("Enter Annual Intrest Rate : ");
        this.r = sc.nextDouble();
        System.out.print("Number of times the interest is compounded per year : ");
        this.t = sc.nextInt();
        System.out.print("Enter Term : ");
        this.n = sc.nextInt();

    }

    void calculateFutureValue(){
//        	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)

        double amount = p * Math.pow((1 + (r/100) / t), n * t);
        double intrestEarned = amount - p;

        System.out.printf("Total value after "+n+" years : %.2f \n",amount);
        System.out.printf("Intrest earned : %.2f",intrestEarned);
    }
}

public class Q2 {
    public static void main(String[] args) {
        CompoundInterestCalculator calc = new CompoundInterestCalculator();
        calc.acceptRedord();
        calc.calculateFutureValue();
    }
}
