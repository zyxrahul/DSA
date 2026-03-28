package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
  int val;
  Node left;
  Node  right;
  Node(int x){
    val=x;
  }
}
class pair{
  int level;
  Node node;
  pair(Node node,int x){
    this.level=x;
    this.node=node;
  }
}
public class TraversalInTree {
  public static void main(String[] args) {
  Node n1=new Node(3);
  Node n2=new Node(4);
  Node n3=new Node(2);
  Node n4=new Node(-1);
  Node n5=new Node(1);
  Node n6=new Node(6);
  Node n7=new Node(9);
   
  //              3
  //            /   \
  //           4     2            
  //         /   \ /   \
  //       -1    1 6    9
  n1.left=n2;
  n2.left=n4;
  n2.right=n5;
  n1.right=n3;
  n3.left=n6;
  n3.right=n7;
  preorder(n1); // 3 4 -1 1 2 6 9 
  System.out.println();
  inorder(n1);  // -1 4 1 3 6 2 9
  System.out.println();
  postorder(n1); //-1 1 4 6 9 2 3
  System.out.println();

  LevelOrder(n1);//3 4 2 -1 1 6 9

  levelOrderLineBy(n1);

}
static void levelOrderLineBy(Node root){
  int currentLevel=0;
  Queue<pair>q=new LinkedList<>();
  pair p=new pair(root,currentLevel); 
  q.add(p);
  while(!q.isEmpty()){
    pair front=q.poll();
    if(front.level!=currentLevel){
      currentLevel++;
      System.out.println();

    }
    System.out.print(front.node.val+" ");
    if(front.node.left!=null)q.add(new pair(front.node.left,currentLevel+1));
    if(front.node.right!=null)q.add(new pair(front.node.right,currentLevel+1));

  }      
}
static void LevelOrder(Node root){
  Queue<Node> q=new LinkedList<>();
  q.add(root);
  while(!q.isEmpty()){
    Node x=q.poll();
    System.out.print(x.val+" ");
    if(x.left!=null)q.add(x.left);
    if(x.right!=null)q.add(x.right);
  }
  System.out.println();
  
}
static void preorder(Node root){
  if(root==null) return;
  System.out.print(root.val+" ");
  preorder(root.left);
  preorder(root.right);
}
static void inorder(Node root){
  if(root==null) return;
  inorder(root.left);
  System.out.print(root.val+" ");
  inorder(root.right);
}
static void postorder(Node root){
  if(root==null) return;
  postorder(root.left);
  postorder(root.right);
  System.out.print(root.val+" ");
}
}
