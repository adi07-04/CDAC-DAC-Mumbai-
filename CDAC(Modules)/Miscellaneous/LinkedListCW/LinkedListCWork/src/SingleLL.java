// Creation of Node
 
public class SingleLL {
Node head;
static class Node{
    int data;
    Node next;
    
    Node(int d)
    {
     this.data=d;
     this.next=null;  // if its not null and have garbage value it will linked to any addr which can be dangerous and we want our LL in our way
    }
}

 void display(){
    
    Node n = head;
    while (n !=null) {
        System.out.print(n.data+ "--->");
        n=n.next;
    }
}
    public static void main(String[] args) throws Exception {
        SingleLL l1 = new SingleLL();
        l1.head=new Node(10);
        Node Second =new Node(20);
        Node Third=new Node(30);
        l1.head.next=Second;
        Second.next= Third;
        l1.display();

    }
}
