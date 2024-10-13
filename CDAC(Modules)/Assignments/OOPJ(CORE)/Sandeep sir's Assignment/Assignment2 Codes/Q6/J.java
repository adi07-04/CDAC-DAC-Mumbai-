public class J {
    public static void main(String[] args) {
        float num1 = 112.2f;
        float num2 = 55.66f;
        
        float min = Float.min(num1, num2);
        float max = Float.max(num1, num2);
        System.out.println("Minimum value : "+ min);
        System.out.println("Maximum value : "+ max);
    }
}
