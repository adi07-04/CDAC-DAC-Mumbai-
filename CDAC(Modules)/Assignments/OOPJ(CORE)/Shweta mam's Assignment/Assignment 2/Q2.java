import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Yor weight (Kg)");
        float w = sc.nextFloat();
        System.out.println("Enter Yor Height (meter)");
        float h = sc.nextFloat();
        float bmi = (float) (w/Math.pow(h,2));
        System.out.printf("BMI Index %.2f%% \n", bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal Weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obesity");
        }
    }
}
