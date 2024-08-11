package DSA.Tree;
import java.util.*;
class node{
  int data;
  node left;
  node right;
  node(int val){
    data=val;
    left=null;
    right=null;
  }
}
 public class BT_insertion {
  
  node create(int data)
  {
    return new node(data);
  }
  node insert(node root,int data){
    if(root==null)
      return create(data);
      
    if(data<root.data)
    root.left=insert(root.left,data);
    
    else
    root.right=insert(root.right,data);
    
    return root;
  }
  
  void display(node root){
    if(root!=null){
      System.out.print(root.data +" ");
      display(root.left);
      display(root.right);
    }
  
  }
  
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    BT_insertion  obj=new BT_insertion ();
    int r=scan.nextInt();
    node root=obj.create(r);
    while(true){
      int data=scan.nextInt();
      if(data<0) break;
      obj.insert(root,data);
    }
    obj.display(root);
    
  
}
}
