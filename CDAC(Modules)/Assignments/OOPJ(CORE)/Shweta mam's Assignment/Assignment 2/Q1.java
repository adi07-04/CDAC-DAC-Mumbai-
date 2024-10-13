import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");

        int year = sc.nextInt();
        if (year < 1000 || year > 9999){
            System.out.println("Enter valid year");
        }else{
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not Leap year");
            }
        }
        sc.close();

    }
}
