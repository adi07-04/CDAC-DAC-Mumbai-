import java.util.*;
class CQ{
	int front;
	int rear;
	int size;
	int Q[];
	
	
	CQ(int n){
		this.size = n;
		this.front = -1;
		this.rear = -1;
		Q= new int[n];
	}
	
	boolean isEmpty(){
		return rear == -1 && front == -1;
	}
	
	boolean isFull(){
		return (rear+1)%size == front;
	}
	
	void push(int data){
		if(isEmpty()){
			front = rear = 0;
			Q[rear] = data;
			return;
		}
		if(isFull()){
			System.out.println("Queue is Full");
			return;
		}
		rear = (rear+1)%size;
		Q[rear] = data;
		return;
	}
	void pop(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		if(front == rear){
			front = rear = -1;
			return;
		}
		front = (front+1)%size;
	}
	
	int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		return Q[front];
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		
		System.out.println(Arrays.toString(Q));
	}
	
}

class CircularQueue{
	public static void main(String [] args){
		CQ q = new CQ(5);
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		
		q.pop();
		q.push(6);
		System.out.println(q.front+"|" +q.rear);
		q.display();
	}
}