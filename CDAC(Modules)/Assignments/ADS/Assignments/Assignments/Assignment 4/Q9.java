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
	int sum;
	
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
	
	int getsum(){
		if(isEmpty()){
			return 0;
		}
		Node temp = head;
		
		while(temp != null){
			sum=sum*10+temp.data;
			temp = temp.next;
		}
		return sum;
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
	
	public static LinkedList sumList(int sum){
		LinkedList l3 = new LinkedList();
		while(sum > 0){
			int ld = sum%10;
			l3.add(ld);
			sum = sum/10;
		}
		return l3;
	}
}
	


class Q9{
	public static void main(String [] args){
		LinkedList l1 = new LinkedList();
		l1.add(9);
		l1.add(9);
		l1.add(9);
		LinkedList l2 = new LinkedList();
		//l2.add(4);
		//l2.add(6);
		l2.add(1);
	
		int sum = l1.getsum()+l2.getsum();
		LinkedList l3 = LinkedList.sumList(sum);
		l3.display(l3.head);
	}
}