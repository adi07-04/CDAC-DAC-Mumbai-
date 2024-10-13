import java.util.*;
class IntegerPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		int temp = num;
		int palindrome = 0;
		
		while(temp > 0){
			int ld = temp%10;
			palindrome = palindrome*10 + ld;
			temp = temp/10;
		}
		if(palindrome == num){
			System.out.println("Numbers are palindrome");
		}else{
			System.out.println("Numbers are Not palindrome");
		}
		
	}
}