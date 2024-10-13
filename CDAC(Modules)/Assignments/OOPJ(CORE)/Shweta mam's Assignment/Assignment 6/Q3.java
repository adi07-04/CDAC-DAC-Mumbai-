import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        String str = "aabbccddeffg";
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        System.out.println("Unique Elements: ");
        for (char c: map.keySet()) {
            if (map.get(c) == 1){
                System.out.print(c +" ");
            }
        }
    }
}
