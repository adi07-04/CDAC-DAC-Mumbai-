import java.util.Scanner;

public class Q5 {
    public static float circle(){
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = (22.0f/7.0f)*rad*rad;
        return area;
    }

    public static float square(){
        System.out.println("Enter Side");
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side*side;
        return area;
    }

    public static float rectangle(){
        System.out.println("Enter Length");
        Scanner sc = new Scanner(System.in);
        float Length = sc.nextFloat();
        System.out.println("Enter Width");
        float Width = sc.nextFloat();
        return (Length*Width);
    }

    public static float traingle(){
        System.out.println("Enter Base");
        Scanner sc = new Scanner(System.in);
        float Base = sc.nextFloat();
        System.out.println("Enter Height");
        float Height = sc.nextFloat();
        return ((1.0f/2.0f)*Base*Height);
    }




    public static void main(String[] args) {
        System.out.println("Choose a number to find the area of :");
        System.out.println(" 1. Circle \n 2. Square \n 3. Rectangle \n 4. Traingle");
        System.out.print(" Enter : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Area of circle : "+ circle());
                break;
            case 2:
                System.out.println("Area of square : "+square());
                break;
            case 3:
                System.out.println("Area of rectangle : "+rectangle());
                break;
            case 4:
                System.out.println("Area of traingle : "+traingle());
                break;
            default:
                System.out.println("Enter Valid value");
        }

    }
}
