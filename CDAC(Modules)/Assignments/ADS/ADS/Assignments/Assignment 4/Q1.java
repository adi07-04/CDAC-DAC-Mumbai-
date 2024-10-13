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
	int size;
	
	boolean isEmpty(){
		return head == null;
	}
	
	void add(int data){
		Node newnode = new Node(data);
		if(isEmpty()){
			head = tail = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}
	
	void remove(){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
	}
	
	void search(int key){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		
		while(temp != null){
			if(temp.data == key){
				System.out.println("Found");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Not Found");
		return;
	}
	
	void display(){
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
	


class Q1{
	public static void main(String [] args){
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.remove();
		l1.search(3);
		l1.display();
	}
}