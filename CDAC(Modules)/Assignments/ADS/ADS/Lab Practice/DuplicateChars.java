import java.util.*;
import java.lang.*;
class DuplicateChars{
	
	public static void main(String args[]){
		HashSet<Character> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String str = sc.next();
		System.out.println("Duplicate characters: ");
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(set.contains(ch)){
				System.out.println(ch);
			}else{
				set.add(ch);
			}
		}
		
		
	}
}