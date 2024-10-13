import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = new int[]{6,6,2,2,1,3,3,3,4,5};
        Arrays.sort(arr);
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        for (int j = i+1; j < arr.length; j++) {
            arr[j] = 0;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] +" ");
        }

    }
}
