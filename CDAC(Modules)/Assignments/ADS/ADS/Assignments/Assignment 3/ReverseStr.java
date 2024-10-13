import java.util.Stack;
class ReverseStr{
	public static void main(String[] args){
		Stack<Character> s = new Stack<>();
		String str = "hello";
		String ans = "";
		
		for(int i = 0; i < str.length(); i++){
			s.push(str.charAt(i));
		}
		while(!s.isEmpty()){
			ans+=s.pop();
		}
		System.out.println(ans);
	}
}