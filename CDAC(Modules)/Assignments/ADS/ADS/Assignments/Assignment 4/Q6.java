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
		tail.next = newnode;
		tail = newnode;
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
	
	Node removeDuplicates(Node head){
		if((head == null)){
			return head;
		}
		Node temp = head;
		Node prev = head;
		while(temp != null){
			
			while(temp != null && temp.data == prev.data){
				temp = temp.next;
			}
			prev.next = temp;
			prev = prev.next;
		}
		return head;
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
	


class Q6{
	public static void main(String []args){
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(1);
		l1.add(1);
		l1.add(2);
		l1.add(2);
		l1.add(2);
		l1.add(2);
		l1.add(2);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(4);
		l1.add(4);
		
		
		Node h2 = l1.removeDuplicates(l1.head);
		l1.display(h2);
	}
}