

class HeapSort{
	public static void heapify(int arr[], int i, int size){
		
		int left = (2*i)+1;
		int right = (2*i)+2;
		int Max = i;
		
		if(left < size && arr[left] > arr[Max]){
			Max = left;
		}
		if(right < size && arr[right] > arr[Max]){
			Max = right;
		}
		if(Max != i){
			int temp = arr[Max];
			arr[Max] = arr[i];
			arr[i] = temp;
			
			heapify(arr,Max,size);
		}
	}
	
	public static void heapsort(int arr[]){
		//create max heap;
		for(int n = arr.length/2; n >= 0; n--){
			heapify(arr,n,arr.length);
		}
		
		for(int n = arr.length-1; n >=0 ; n--){
			int temp = arr[0];
			arr[0] = arr[n];
			arr[n] = temp;
			
			heapify(arr,0,n);
		}
	}
	
	public static void main(String []args){
		int arr[] = {3,4,1,6,2,5};
		heapsort(arr);
		for(int n = 0; n < arr.length; n++){
			System.out.print(arr[n]+" ");
		}
	}
}