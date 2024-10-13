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
	
	void reverse(){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		Node temp = tail;
		while(temp != null){
			System.out.print(temp.data+"<-->");
			temp = temp.prev;
		}
		System.out.print("null");
	}
}

class Q8{
	public static void main(String [] args){
		DLL l1 = new DLL();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
	//1.delete();
		l1.reverse();
	}
}