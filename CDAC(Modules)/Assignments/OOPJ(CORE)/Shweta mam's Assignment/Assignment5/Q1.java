import java.util.Scanner;

class BankAccount{
    double balance;

    void deposit(double Amount){
        this.balance+=Amount;
        System.out.println("Amount Deposited");
        System.out.println("Current balance: "+this.balance);
    }
    void withdraw(double Amount){
        this.balance -= Amount;
        System.out.println(Amount+" Rs Withdraw");
        System.out.println("Current balance: "+this.balance);
    }

    void viewBalance(){
        System.out.println("Balance: "+this.balance );
    }
}

class SavingAccount extends BankAccount{
    @Override
    void withdraw(double Amount) {
        if (Amount > this.balance){
            System.out.println("Not Enough Bank Balance");
        }else if (Amount > 100000){
            System.out.println("Account limit Exceeded");
        }else{
            this.balance -= Amount;
            System.out.println(Amount+" Rs Withdraw");
            System.out.println("Current balance: "+this.balance);
        }
    }
}


public class Q1 {
    static Scanner sc = new Scanner(System.in);
    public static int menu(){

        System.out.println("0. Exit");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. View Balance");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        BankAccount acc = new SavingAccount();
        int choice;
        while (( choice = menu()) != 0){
            switch (choice){
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    acc.deposit(sc.nextDouble());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    acc.withdraw(sc.nextDouble());
                    System.out.println();
                    break;
                case 3:
                    acc.viewBalance();
                    System.out.println();
                    break;
            }
        }
    }
}
