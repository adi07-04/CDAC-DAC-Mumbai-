class Node{
	Node next;
	int data;
	Node(int data){
		this.data = data;
	}
}

class LinkedList{
	Node head = null;
	Node tail = null;
	int size = 0;
	
	boolean isEmpty(){
		return head == null;
	}
	
	void add(int data){
		Node newnode = new Node(data);
		if(isEmpty()){
			head = tail = newnode;
			size++;
			return;
		}
		newnode.next = head;
		head = newnode;
		size++;
	}
	
	void remove(){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
		size--;
	}
	
	 
	int find(LinkedList l1,int n){
		if(isEmpty()){
			return -1;
		}
		int idx = size - n;
		int count = 0;
		Node temp = head;
		while(count < idx){
			temp = temp.next;
			count++;
		}
		return temp.data;
		
	}
	
	
	
	
	void display(Node head){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
	


class Q5{
	public static void main(String [] args){
	
		LinkedList l2 = new LinkedList();
		l2.add(26);
		l2.add(28);
		l2.add(25);
		l2.add(18);
		l2.add(12);
		System.out.println(l2.find(l2,1));
		System.out.println(l2.size);
		l2.display(l2.head);
		//l2.display(l2.head);
	}
}