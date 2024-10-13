public class Q3 {
    public static void main(String[] args) {
        int intValue = 10;
        float floatValue = 15.5f;
        double doubleValue = 20.75;

        float result1 = intValue + floatValue;
        System.out.println("Result of int + float: " + result1);

        double result2 = floatValue + doubleValue;
        System.out.println("Result of float + double: " + result2);

        double result3 = intValue + doubleValue;
        System.out.println("Result of int + double: " + result3);

        double result4 = intValue + floatValue + doubleValue;
        System.out.println("Result of int + float + double: " + result4);
    }
}
