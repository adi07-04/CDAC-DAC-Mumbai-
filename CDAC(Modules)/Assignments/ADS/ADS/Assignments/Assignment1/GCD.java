import java.util.*;
class GCD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter The Number 2: ");
		int num2 = sc.nextInt();
		
		int size = num1 < num2 ? num1 : num2;
		int GCD = 0;
		
		for(int i = 1; i<= size; i++){
			if(num1% i == 0 && num2%i == 0){
				GCD = i;
			}
		}
		System.out.println(GCD);
		
	}
}