import java.util.Scanner;
class Fibonacci{
	public static int Fib(int n){
		if(n == 0 || n == 1){
			return n;
		}
		return Fib(n-1)+Fib(n-2);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		System.out.println(Fib(num));
	}
}