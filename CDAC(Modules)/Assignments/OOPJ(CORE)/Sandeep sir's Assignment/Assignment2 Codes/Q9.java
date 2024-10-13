public class Q9 {
    // Instance variables
    byte instanceByte;
    short instanceShort;
    int instanceInt;
    long instanceLong;
    float instanceFloat;
    double instanceDouble;
    boolean instanceBoolean;
    char instanceChar;

    // Static variables
    static byte staticByte;
    static short staticShort;
    static int staticInt;
    static long staticLong;
    static float staticFloat;
    static double staticDouble;
    static boolean staticBoolean;
    static char staticChar;

    public static void main(String[] args) {
        // Create an object to access instance variables
        Q9 obj = new Q9();

        // Print default values of instance variables
        System.out.println("Instance Variable Default Values:");
        System.out.println("Byte: " + obj.instanceByte);
        System.out.println("Short: " + obj.instanceShort);
        System.out.println("Int: " + obj.instanceInt);
        System.out.println("Long: " + obj.instanceLong);
        System.out.println("Float: " + obj.instanceFloat);
        System.out.println("Double: " + obj.instanceDouble);
        System.out.println("Boolean: " + obj.instanceBoolean);
        System.out.println("Char: [" + obj.instanceChar + "]");

        // Print default values of static variables
        System.out.println("\nStatic Variable Default Values:");
        System.out.println("Byte: " + staticByte);
        System.out.println("Short: " + staticShort);
        System.out.println("Int: " + staticInt);
        System.out.println("Long: " + staticLong);
        System.out.println("Float: " + staticFloat);
        System.out.println("Double: " + staticDouble);
        System.out.println("Boolean: " + staticBoolean);
        System.out.println("Char: [" + staticChar + "]");
    }
}
