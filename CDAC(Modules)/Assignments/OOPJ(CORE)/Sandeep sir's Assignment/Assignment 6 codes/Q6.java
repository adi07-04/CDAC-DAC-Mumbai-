public class Q6 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,3,4,7,8};
        int n = arr.length+1;
        int sum_n = n*(n+1)/2;
        int curr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
        }
        int Missing = sum_n - curr_sum;
        System.out.println("Missing: "+Missing);
    }
}
