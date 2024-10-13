public class Q10 {
    public static void main(String[] args) {
        int num1 =  Integer.parseInt(args[0]) ;
        char operator = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]) ;
        
        switch (operator) {
            case '+':
                 System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
               break;
            case '*':
               System.out.println(num1*num2);
              break;   
            case '/':
            System.out.println(num1/num2);
                break;
            default:
                System.out.println("Enter valid operator");
                break;
        }

    }
}
