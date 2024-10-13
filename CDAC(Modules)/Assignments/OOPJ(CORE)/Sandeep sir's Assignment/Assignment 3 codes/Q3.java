import java.util.Scanner;

class Bmitracker{
    float height;
    float weight;
    float BMI;
    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height (in meter): ");
        this.height = sc.nextFloat();
        System.out.print("Enter weight (in Kg): ");
        this.weight = sc.nextFloat();
    }
//    o	Underweight: BMI < 18.5
//    o	Normal weight: 18.5 ≤ BMI < 24.9
//    o	Overweight: 25 ≤ BMI < 29.9
//    o	Obese: BMI ≥ 30

    void calculateBMI(){
        this.BMI = weight/(height*height);
        System.out.println("BMI: " + this.BMI);
        if (BMI < 18.5) {
            System.out.println("Result: UnderWeight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Result: Normal Weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Result: Overweight");
        }else{
            System.out.println("Result: Obesity");
        }
    }


}

public class Q3 {
    public static void main(String[] args) {
        Bmitracker track = new Bmitracker();
        track.acceptRecord();
        track.calculateBMI();
    }
}
