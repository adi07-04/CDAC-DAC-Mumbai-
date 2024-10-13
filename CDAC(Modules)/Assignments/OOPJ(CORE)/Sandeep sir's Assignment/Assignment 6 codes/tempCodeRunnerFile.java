public class Q5 {
    public static void main(String[] args) {
        int arr1[] = {1,3,2,5,4,8};
        int arr2[] = {4,5,6,7,8};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.print(arr2[j]+" ");
                }
            }
        }
    }
}
