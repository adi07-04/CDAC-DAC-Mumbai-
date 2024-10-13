import java.lang.invoke.ConstantBootstraps;
import java.util.*;

public class Q1 {
    public static List<Integer> getList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of Elements: ");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+i+" Element: ");
            list.add(i, sc.nextInt());
        }
        return list;
    }
    public static void main(String[] args) {
       List<Integer> list = getList();
       List<Integer> Ans = new ArrayList<>();
        Collections.sort(list);

        System.out.println("List: ");

        System.out.println(list);

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) == list.get(i+1) && !Ans.contains(i)){
                Ans.add(list.get(i));
            }
        }
        System.out.println("Repeated Elements "+Ans);


    }
}
