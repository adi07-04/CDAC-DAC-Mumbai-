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
			size--;
			return;
		}
		Node temp = head;
		while(temp.next != tail){
			temp = temp.next;
		}
		temp = tail;
		tail.next = null;
		size--;
	}
	
	Node rotate(int k) {
    if (isEmpty()) {
        System.out.println("List is Empty");
        return null;
    }
    tail.next = head;
    k = k % size; 
    Node temp = head;
    for (int i = 0; i < k-1; i++) {
        temp = temp.next;
    } 
    head = temp.next;
    temp.next = null;
    tail = temp; 

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
	


class Q10{
	public static void main(String [] args){
		LinkedList l1 = new LinkedList();
		l1.add(5);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		
		Node hd = l1.rotate(3);
		l1.display(hd);
	}
}