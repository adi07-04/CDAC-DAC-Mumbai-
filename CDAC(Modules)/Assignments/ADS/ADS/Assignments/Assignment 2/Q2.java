import java.util.HashSet;
class Q2{
	public static void main(String [] args){
		HashSet<Integer> set = new HashSet<>();
		int arr[] = {0,0,1,1,1,2,2,3,3};
		for(int i = 0; i < arr.length; i++){
			set.add(arr[i]);
		}
		System.out.println("Unique elements :"+set.size());
		
	}
}

/*
TC: O(n)

Explaination: inserted all the elements of array in set and returned the size of set

*/