import java.util.Stack;
class Queue{
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	boolean isEmpty(){
		return s1.isEmpty();
	}
	
	void enq(int data){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		
	}
	int dq(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		
		return s1.pop();
	}
	int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		return s1.peek();
	}
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		while(!s1.isEmpty()){
			System.out.println(s1.pop());
		}
	}
	
}

class Queue_using_2Stacks{
	public static void main(String [] args){
		Queue q = new Queue();
		q.enq(1);
		q.enq(2);
		q.enq(3);
		q.dq();
		q.peek();
		q.display();
	}
	

}