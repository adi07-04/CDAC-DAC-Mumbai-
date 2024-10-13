import java.util.*;
class Q8{
	public static void main(String [] args){
		int n = 4;
		int queries [][] = {{1,3,50},{2,4,70}};
		int arr[] = new int[n];
		int max = 0;
		for(int i = 0; i < queries.length; i++){
			int from = queries[i][0];
			int to = queries[i][1];
			
			for(int j = from ; j <= to; j++){
				arr[j-1]+=queries[i][2];
				if(arr[j-1]>max){max = arr[j-1];}
			}
			
		}
		System.out.println(max);
		
		System.out.println(Arrays.toString(arr));
		
	}
}