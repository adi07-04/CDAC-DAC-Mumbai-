import java.util.Scanner;
class PrimeNumber{
	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");

		int num = sc.nextInt();
		System.out.println(PrimeNumber.isPrime(num));
		
		
	}
}