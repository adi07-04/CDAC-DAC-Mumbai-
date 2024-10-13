class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DLL{
	Node head;
	Node tail;
	
	boolean isEmpty(){
		return head == null;
	}
	
	void insert(int data){
		Node newnode = new Node(data);
		if(isEmpty()){
			head = tail = newnode;
			return;
		}
		tail.next = newnode;
		newnode.prev = tail;
		tail = newnode;
	}
	
	void delete(){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		if(head == tail){
			head = null;
			return;
		}
		tail = tail.prev;
		tail.next = null;
	}
	
	void print(){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+"<-->");
			temp = temp.next;
		}
		System.out.print("null");
	}
}

class Q7{
	public static void main(String [] args){
		DLL l1 = new DLL();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.delete();
		l1.print();
	}
}