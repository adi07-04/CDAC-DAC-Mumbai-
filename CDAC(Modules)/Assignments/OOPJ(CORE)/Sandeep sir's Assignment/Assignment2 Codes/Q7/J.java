public class J {
    public static void main(String[] args) {
        double num1 = 112.2;
        double num2 = 556.6;
        
        double min = Double.min(num1, num2);
        double max = Double.max(num1, num2);
        System.out.println("Minimum value : "+ min);
        System.out.println("Maximum value : "+ max);
    }
}
