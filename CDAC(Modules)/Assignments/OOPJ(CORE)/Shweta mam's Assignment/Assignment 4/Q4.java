public class Q4 {
    public static void main(String[] args) {
        int a = 1234;
//    int to double
        double doubl = a;
        System.out.println("int to double: "+doubl);
//     int to float
        float flot = a;
        System.out.println("int to float: "+flot);

//       int to boolean
//        boolean bool = a; // compile time error;

//        int to String
        String str = Integer.toString(a);
        System.out.println("int to String: "+str);
    }

}
