import java.util.*;
class Q5{
	
	public static void main(String [] args){
		int arr[] = {1,2,3,4,5,6};
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j){
			int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

/*
TC: O(n/2) -> O(n)

Explaination: i have taken two pointers i & j, i initializes at 0 and j initialized at n-1 
then i have iterated i foeward and j backward until j > i and swapped then at every iteration.

*/