
import java.util.Stack;
class Postfix{
    public static void main(String [] args) {
        Stack<Integer> s = new Stack<>();
        String str = "5 3 + 2 *";
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/")) {
                int num = Integer.parseInt(arr[i]);
                s.push(num);
            } else {
                int operand1 = s.pop();
                int operand2 = s.pop();
                switch (arr[i]) {
                    case "+":
                        s.push(operand1 + operand2);
                        break;
                    case "-":
                        s.push(operand1 - operand2);
                        break;
                    case "*":
                        s.push(operand1 * operand2);
                        break;
                    case "/":
                        s.push(operand1 / operand2);
                        break;
                }

            }


        }
        System.out.println(s.peek());
    }}