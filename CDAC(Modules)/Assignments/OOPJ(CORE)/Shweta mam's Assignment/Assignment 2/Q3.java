import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Yor age");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
