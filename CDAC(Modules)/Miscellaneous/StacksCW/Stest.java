// Stack implementation by using Array 
class MyStack{
  static final int MAX = 1000;
  private int top;
  private int [] arr;
    
    
// constructor
    public MyStack(){
      this.top=-1;
      this.arr = new int[MAX];

    }
    public boolean isEmpty(){
        return(top<0); // it is empty when top=-1 or top<0
    }
    public int size(){
       return((top+1)); // as top=-1 or top<0
    }
    public void push( int value){
    if(top>= (MAX-1)){ // if stack is already filled
       System.out.println("Stack Overflow");
      } else{
        top++;
        arr[top]=value;
      } 
    }

    public int pop(){
      if( isEmpty()){ // if stack is empty 
        System.out.println("StackUnderflow");
        return -1;
      }else{
        int topVal=arr[top];
        top--;
        return topVal;
      }
    }

    public int peak(){
      if(isEmpty()){
        System.out.println("StackUnderflow");
        return -1;
      }else{
        return arr[top];
      }
    }
    public void print(){
      for(int i=top;i>-1;i--){
        System.out.println(arr[i]);
      }
    }


}
public class Stest {
  public static void main(String[] args) {
 MyStack s = new MyStack(); 
   s.push(1);
   s.push(2);
   s.push(3);
   s.print();
   System.out.println("popped element: " + s.pop());
   System.out.println("popped elements: " + s.pop());
   System.out.println("the top element is: " + s.peak());
  

  }
}
