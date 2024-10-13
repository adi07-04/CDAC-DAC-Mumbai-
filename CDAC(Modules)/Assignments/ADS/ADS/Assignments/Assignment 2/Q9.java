
import java.util.*;
class Q9{
	 static boolean isPalindrome(String str){
		
		int i = 0;
		int j = str.length()-1;
		
		while(i <= j){
			if(str.charAt(i) != str.charAt(j)){
				System.out.println("Not Palindrome");
				return false;
			}
			i++;
			j--;
		}
		System.out.println("String is Palindrome");
		return true;
	 }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		isPalindrome(str);
	}
}