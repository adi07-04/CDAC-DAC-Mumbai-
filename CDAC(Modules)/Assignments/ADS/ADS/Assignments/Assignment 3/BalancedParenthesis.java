import java.util.Stack;
class BalancedParenthesis{
	public static void main(String[] args){
		Stack<Character> s = new Stack<>();
		String str = "([)]";
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch == '(' || ch == '{' || ch == '['){
				s.push(ch);
			}
			else{
				char p = s.peek();
				if(p == '(' && ch == ')' || p == '{' && ch == '}' || p == '[' && ch == ']'){
					s.pop();
				}
			}
		}
		System.out.println(s.isEmpty());
	}
}