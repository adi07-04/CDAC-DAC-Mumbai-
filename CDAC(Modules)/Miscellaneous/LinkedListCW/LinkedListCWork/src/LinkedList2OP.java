public class LinkedList2OP {
public static class Node{
    private int data;
    private Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;
public static int size;

public void addFirst(int data){
Node newnode= new Node(data);  // craetes new node or instance of node
size++;  // increases the size 
if(head==null){
head=tail=newnode;  // whwn there is no node and it is null
return;
}
newnode.next=head; // new node next points to the head 
head=newnode; // now head is equal to newnode
}

public void addLast(int data){
    Node newnode=new Node(data);
    size++;
     if(head==null){
        head=tail=newnode;
        return;
     }
    tail.next=newnode;  // prev tail next points to the new node to form a link
    tail = newnode;  // now tail is equal to the newnode which is at the last 

}

public void print(){
    if(head==null){
      System.out.println("LL IS EMPTY");
    }
    Node temp = head;  // uses temp as it will not change  our head
    while(temp!=null){
        System.out.print(temp.data+" "+">>>");   // prints the data of the node
        temp=temp.next; // then links to next node
    }
System.out.println();
}

public void addInMiddle(int index,int data){
    if(index==0){   // as head is first index we need it to be change acc to addFirst method
        addFirst(data);
        return;
    }
    
    Node newNode= new Node(data);
    size++;
    Node temp = head;
    int i=0;
    while(i<index-1){  // iterates till prev node index ie index-1
        temp= temp.next; // if it is less than index-1 then point to next node
        i++;
    }
    newNode.next=temp.next;  // to form link newnode with next node to which temp was pointing
    temp.next= newNode;  // now the temp next points to the new node hence element is added in middle 
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

 
    
    
  public static void main(String args[]){
      LinkedList2OP ll = new LinkedList2OP();
      ll.addFirst(4);
      ll.print();
      ll.addFirst(3);
      ll.print();
      ll.addFirst(2);
      ll.print();
      ll.addFirst(1);
      ll.print();
      ll.addLast(5);
      ll.print();
      ll.addLast(6);
      ll.print();
      ll.addInMiddle(2, 9);
      ll.print();
      ll.addInMiddle(0, 7);
      ll.print();
     //System.out.println("size of ll is "+ size);
     ll.reverse();
     ll.print();

  }   
 }
 

