public class Q3 {
    public static void main(String[] args) {
        int arr[] = new int[]{88,42,56,79,12,11};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimun: "+ min);
        System.out.println("Maximum: "+ max);


    }
}
