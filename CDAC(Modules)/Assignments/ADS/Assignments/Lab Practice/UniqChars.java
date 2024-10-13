import java.util.*;

public class UniqChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (map.containsKey(ch)){
                    int val = map.get(ch);
                    map.put(ch, val+1);
                }else{
                    map.put(ch,1);
                }
        }

        System.out.println("Unique Elements: ");
       // for (char c: map.keySet()) {
         //   if (map.get(c) == 1){
           //     System.out.print(c +" ");
            //}
       // }
		
		for(int i = 0; i< str.length();i++){
			char ch = str.charAt(i);
			if(map.get(ch) == 1){
				System.out.print(ch +" ");
				break;
			}
		}
    }
}
