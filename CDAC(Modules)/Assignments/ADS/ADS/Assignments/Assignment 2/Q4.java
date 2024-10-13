import java.util.Scanner;
class Q4{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String res = "";
		for(int i = str.length()-1; i >= 0; i--){
			res+=str.charAt(i);
		}
		System.out.println(res);
		
	}
}

/*
TC : O(n)

Explaination: Taken a input String from user then and just iterated reverse on it and stored the i th index in result 
string
*/