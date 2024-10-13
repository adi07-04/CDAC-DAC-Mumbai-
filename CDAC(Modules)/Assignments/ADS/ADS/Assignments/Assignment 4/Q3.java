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
	void createcycle(){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		tail.next = head;
	}
	
	boolean detectcycle(){
		if(isEmpty()){
			System.out.println("List is Empty");
			return false;
		}
		Node fast = head;
		Node slow = head;
		
		while(fast!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				return true;
			}
		}
		return false;
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
	


class Q3{
	public static void main(String [] args){
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		//l1.createcycle();
		System.out.println(l1.detectcycle());
		
		
	}
}