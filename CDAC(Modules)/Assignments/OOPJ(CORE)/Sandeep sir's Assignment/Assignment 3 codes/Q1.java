import java.util.Scanner;

class LoanAmortizationCalculator{
    double p ;
    double r;
    double n;

    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        this.p = sc.nextDouble();
        System.out.print("Enter Annual Intrest Rate : ");
        this.r = sc.nextDouble();
        System.out.print("Enter Term : ");
        this.n = sc.nextDouble();
    }

    void  calculateMonthlyPayment(){
        double monthlyIntrestRate = r/(12*100);
        int numberOfMonths =(int) n*12;

        double monthlyPayment = p*(monthlyIntrestRate * Math.pow((1+monthlyIntrestRate),numberOfMonths) )
                                 / ( Math.pow(1+monthlyIntrestRate,numberOfMonths)-1);

        System.out.printf("Monthly payment: %.2f \n", monthlyPayment);

        double amountPaidOverLoan = (monthlyPayment*numberOfMonths) + p;

        System.out.printf("Total amount paid over the life of the loan :%.2f ", amountPaidOverLoan);
    }

}

public class Q1 {
    public static void main(String[] args) {
        LoanAmortizationCalculator lac = new LoanAmortizationCalculator();
        lac.acceptRecord();
        lac.calculateMonthlyPayment();
    }
}
