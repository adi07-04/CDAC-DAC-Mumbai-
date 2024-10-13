import java.util.*;
class Q6{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String res = str.replaceAll("\\s+"," ");
		String ans = "";
		String s[] = res.split(" ");
		
		for(int i = s.length-1; i >= 0; i--){
			ans+=s[i]+" ";
		}
		System.out.println(ans);
		
		
	}
}
/*
 * TC: O(n)
 * Explaination : 
 * i have taken string as an input and replaced all whitespaces with single space and then converted the string to string array 
 * and simply traversed reverse to store elements in result string 
 */