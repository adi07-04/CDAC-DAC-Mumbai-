public class PrimitiveToString {
    public static void main(String[] args) {
        // Initialize variables of all primitive types
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 42;
        long longValue = 100000L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159;
        boolean boolValue = true;
        char charValue = 'A';

        // Print using the toString method of wrapper classes
        System.out.println("Using toString method:");
        System.out.println("Byte: " + Byte.toString(byteValue));
        System.out.println("Short: " + Short.toString(shortValue));
        System.out.println("Integer: " + Integer.toString(intValue));
        System.out.println("Long: " + Long.toString(longValue));
        System.out.println("Float: " + Float.toString(floatValue));
        System.out.println("Double: " + Double.toString(doubleValue));
        System.out.println("Boolean: " + Boolean.toString(boolValue));
        System.out.println("Character: " + Character.toString(charValue));

        // Print using the valueOf method of the String class
        System.out.println("\nUsing valueOf method:");
        System.out.println("Byte: " + String.valueOf(byteValue));
        System.out.println("Short: " + String.valueOf(shortValue));
        System.out.println("Integer: " + String.valueOf(intValue));
        System.out.println("Long: " + String.valueOf(longValue));
        System.out.println("Float: " + String.valueOf(floatValue));
        System.out.println("Double: " + String.valueOf(doubleValue));
        System.out.println("Boolean: " + String.valueOf(boolValue));
        System.out.println("Character: " + String.valueOf(charValue));
    }
}
