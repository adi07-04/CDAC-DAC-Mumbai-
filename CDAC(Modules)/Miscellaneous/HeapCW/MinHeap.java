import java.util.Arrays;

class MinHeap{
    int [] arr;
    int size;
    int capacity;

    public MinHeap(int c){
        arr=new int[c];
        size=0;
        capacity=c;
    } 
    int left(int i) {
        return (2*i+1);
    }

    int right(int i){
        return(2*i+2);
    }

    int parent(int i){
        return (i-1)/2;
    }

    
    

    public void insert(int x){
        if(size==capacity){
            System.out.println(" heap reached its capacity");
            return;
        }
        size++;
        arr[size-1]=x;
        int i = size-1;
        while(i!=0 && arr[parent(i)]>arr[i]){
            int temp;
            temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)] = temp;
           i=parent(i);
        }
    }

    public void printHeap(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) { 
        MinHeap heap = new MinHeap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(12);
        heap.insert(25);
        heap.insert(45);

        heap.printHeap();  
    }
    
}