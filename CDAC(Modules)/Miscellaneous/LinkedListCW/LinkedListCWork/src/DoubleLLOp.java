public class DoubleLLOp {
    
    public static class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
}
     
     public static Node head;
     public static Node tail;
     public static int size;
  
     public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){   // base case 
            head=tail=newNode;
            return;    
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode; 


     }
     public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){   // base case 
            head=tail=newNode;
            return;    
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
         


     }
     public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
     }   

     public int removeFirst(int data){
        if(head==null){
            System.out.println("DLL IS EMPTY");
            return Integer.MIN_VALUE;   
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev=null;
        size--;
        return val;

     }

     
     public int removeLast(int data){
        if(head==null){
            System.out.println("DLL IS EMPTY");
            return Integer.MIN_VALUE;   
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }

        head=prev;
    }

    
    


    public static void main(String[] args){
       DoubleLLOp dl = new DoubleLLOp();
       dl.addFirst(3);
       dl.addFirst(2);
       dl.addFirst(1);
       dl.display();
       dl.reverse();
       System.out.println("reverse of list is ->");
       System.out.println("/////////////////");
       dl.display();
       System.out.println("////////////////");
       dl.removeFirst(1);
       dl.removeFirst(2);
       dl.display();
       System.out.println("size is " + size);
       dl.addLast(1);
       dl.addLast(2);
       dl.addLast(3);
       dl.display();
       dl.removeLast(3);
       dl.removeLast(2);
       dl.display();
      


       
    




    }
}
