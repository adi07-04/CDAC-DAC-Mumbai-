import java.util.Arrays;
class Q10{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5};
		int d = 2;
		int n = arr.length;
		int ans[] = new int[n];
		for(int i = 0; i < n; i++){
			int idx = (i-d) % n;
			if(idx < 0){idx+=n;}
			ans[idx] = arr[i];
		}
		System.out.println(Arrays.toString(ans));
		
	}
}