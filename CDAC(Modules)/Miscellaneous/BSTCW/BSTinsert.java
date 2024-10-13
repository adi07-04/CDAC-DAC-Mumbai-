
public class BSTinsert{
    class Node{
        int key;
        Node left;
        Node right;
    
        public Node(int key){
           this.key=key;
           this.left=null;
           this.right=null;
    
        }
    }
   Node root;
  public BSTinsert()
  {
    root=null;
  }

  void insert(int key){
    root= insertRec(root,key);
  }

  Node insertRec(Node root,int key){
    if(root==null){
        root=new Node(key);
        return root;
    }
    if(key<root.key){
        root.left=insertRec(root.left, key);
    }
    else if(key>root.key){
        root.right=insertRec(root.right,key);
    }
    
      return root;
    
    }

      void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.key +" ");
            inorderRec(root.right);
        }

    }
    
   static boolean search(Node root, int key){
        if(root == null ){
            return false;
        }
        else if(root.key==key){
            return true;
        }
        if(key>root.key){
            return search(root.right, key);
        }
        return search(root.left, key);

    }


public static void main(String[] args) {
    BSTinsert tree = new BSTinsert();
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    tree.inorder();
    System.out.println();

    int key = 60;
    if (search(tree.root, key)) {
        System.out.println("Key " + key + " found in the tree.");
    } else {
        System.out.println("Key " + key + " not found in the tree.");
    }
   
    
}


}