
import java.util.*;
class MinHeap{
	ArrayList<Integer> list = new ArrayList<>();
	
	public  void insert(int data){
		list.add(data);
		int child = list.size()-1;
		int par = (child)/2;
		
		while(list.get(child) < list.get(par)){
			int temp = list.get(par);
			list.set(par,list.get(child));
			list.set(child,temp);
			
			child = par;
			par = (child)/2;
		
		}
	}
	
	public  void remove(){
		//setp1
		int temp = list.get(list.size()-1);
		list.set(list.size()-1,list.get(0));
		list.set(0,temp);
		//step2
		list.remove(list.size()-1);
		heapify(0);
	}
	
	public  void heapify(int i){
		int MinValue = i;
		int left = (2*i)+1;
		int right = (2*i)+2;
		
		if(left < list.size() && list.get(left) < list.get(MinValue)){
			MinValue = left;
		}
		if(right < list.size() && list.get(right) < list.get(MinValue)){
			MinValue = right;
		}
		if(MinValue != i){
			int temp = list.get(i);
			list.set(i,list.get(MinValue) );
			list.set(MinValue, temp);
			heapify(MinValue);
		}
	}
	
	public static void main (String[] args){
		MinHeap hp = new MinHeap();
		hp.insert(3);
		hp.insert(5);
		hp.insert(4);
		hp.insert(2);
		hp.insert(1);
		hp.remove();
		System.out.println(hp.list);
	}
}