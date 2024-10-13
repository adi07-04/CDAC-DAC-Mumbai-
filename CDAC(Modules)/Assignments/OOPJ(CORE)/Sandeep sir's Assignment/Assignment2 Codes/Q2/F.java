public class F {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";  // Method-local variable
        byte number = Byte.parseByte(strNumber);  // Attempting to convert to byte
        System.out.println(number);

    }
}
