
import java.util.Scanner;
class Factorial{
	public static int fact(int n){
		if(n == 1){
			return 1;
		}
		
		return n*fact(n-1);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		System.out.println(fact(num));
	}
}