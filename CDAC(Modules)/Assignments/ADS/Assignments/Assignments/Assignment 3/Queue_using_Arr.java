class Queue{
	int rear;
	int Q[];
	int cap;
	Queue(int n){
		Q= new int[n];
		rear = -1;
		cap = n;
	}
	boolean isFull(){
		return rear+1 == cap;
	}
	
	boolean isEmpty(){
		return rear == -1;
	}
	
	void enqueue(int data){
		if(isFull()){
			System.out.println("Queue is Full");
			return;
		}
		rear++;
		Q[rear] = data;
	
	}
	
	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return ;
		}
		int front = Q[0];
	
		for(int i = 0; i < rear; i++){
			Q[i] = Q[i+1];
		}
		rear--;
		//return front;
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("queue is Empty");
			return ;
		}
		for(int i = 0; i <= rear ; i++){
			System.out.print(Q[i]+" ");
		}
		
	}
	
}

class Queue_using_Arr{
	public static void main(String[] args){
		Queue q = new Queue(5);
		q.enqueue(5);
		q.enqueue(10);
		q.display();
		System.out.println();
		q.dequeue();
		q.dequeue();
		q.display();
		
	}
}