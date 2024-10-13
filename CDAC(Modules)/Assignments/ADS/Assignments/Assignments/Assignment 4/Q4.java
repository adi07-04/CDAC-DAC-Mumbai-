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
	
	 Node merge(LinkedList l1, LinkedList l2){
		if(l1.head == null){
			return l2.head;
		}
		if(l2.head == null){
			return l1.head;
		}
		Node t1 = l1.head;
		Node t2 = l2.head;
		
		Node mergehead;
		
		if(t2.data < t1.data){
			mergehead = t2;
			t2=t2.next;
		}else{
			mergehead = t1;
			t1 = t1.next;
		}
		Node curr = mergehead;
		
		while(t1 != null && t2 != null){
			if(t1.data <= t2.data ){
				curr.next = t1;
				t1 = t1.next;
				curr = curr.next;
			}else{
				curr.next = t2;
				t2 = t2.next;
				curr = curr.next;
			}
		}
		if(t1 != null){
			curr.next = t1;
		}if(t2 != null){
			curr.next = t2;
		}
		
		
		return mergehead;
		
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
	


class Q4{
	public static void main(String [] args){
		LinkedList l1 = new LinkedList();
		l1.add(400);
		l1.add(300);
		l1.add(10);
		LinkedList l2 = new LinkedList();
		l2.add(26);
		l2.add(28);
		l2.add(25);
		l2.add(18);
		l2.add(12);
		
		Node mhead = l1.merge(l1,l2);
		l1.display(mhead);
		//l2.display(l2.head);
	}
}