class Stack{
	int top;
	int size;
	int s[];
	int capacity;
	Stack(int n){
		s = new int[n];
		top = -1;
		capacity = n;
	}
	boolean isEmpty(){
		return top == -1;
	}
	boolean isFull(){
		if(size >= capacity){
			return true;
		}
		return false;
	}
	
	void push(int data){
		if(size >= capacity){
			System.out.println("Stack is full");
			return;
		}
		top++;
		s[top] = data;
		size++;
	}
	
	int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		int val = s[top];
		top--;
		size--;
		return val;
	}
	int peek(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return s[top];
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return ;
		}
		
		while(!isEmpty()){
			System.out.println(pop());
		}
	}
}

class StackUsingArray{
	public static void main(String[] args){
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.pop();
		s.push(6);
		System.out.println(s.isEmpty()+" Size: "+s.size);
		s.display();
		
	}
}