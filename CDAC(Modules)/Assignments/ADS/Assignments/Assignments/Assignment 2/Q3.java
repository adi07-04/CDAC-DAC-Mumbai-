import java.util.Scanner;
class Q3{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String res = str.replaceAll(" ","");
		System.out.println(res);
		
	}
}
/*
TC : O(n)

Explaination: i have taken a input from user and on that input i have called a method to replace all the spaces from
string. After that i simply printed the String


*/