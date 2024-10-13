import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> merged = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(30);
        l1.add(50);
        l1.add(80);
        l1.add(90);
        l1.add(100);

        List<Integer> l2 = new ArrayList<>();
        l2.add(20);
        l2.add(40);
        l2.add(60);
        l2.add(70);

        int i = 0;
        int j = 0;

        while (i < l1.size() && j < l2.size()){
            if (l1.get(i) < l2.get(j)){
                merged.add(l1.get(i));
                i++;
            }else{
                merged.add(l2.get(j));
                j++;
            }
        }
        while (i < l1.size()){
            merged.add(l1.get(i));
            i++;
        }
        while (j < l2.size()){
            merged.add(l2.get(j));
            j++;
        }

        System.out.println(merged);
    }
}
