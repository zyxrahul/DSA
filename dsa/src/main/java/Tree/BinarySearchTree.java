package Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
  //NOde class Creation
  static class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
      this.val=val;
      this.left=null;
      this.right=null;
    }
  }
  public static void main(String[] args) {

  
      System.out.print("Enter Data to create BST: ");
      Node root=takeInput();
      
      System.out.println("\nBST print ==>");
      levelOrderPrint(root);
      System.out.print("Preorde: ");
      preorder(root);
      System.out.println();
      System.out.print("Inorder: ");
      inorder(root);
      System.out.println();
      System.out.print("postorder: ");
      postorder(root);
      System.out.println();
      Scanner input=new Scanner(System.in);
      System.out.print("Enter the target : ");
      int key=input.nextInt();
      System.out.println(search(root, key));
      System.out.println("Min Element in Tree: "+Min(root));
      System.out.println("Max element in tree: "+Max(root));

  }


  public static void levelOrderPrint(Node root){
    if(root==null){
      return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null); //Seperator
    while(!q.isEmpty()){
      Node temp=q.poll();
      if(temp==null){
        System.out.println();
        if(q.isEmpty()) break;
        else q.add(null);
      }
      else{
        System.out.print(temp.val+" ");
        if(temp.left!=null)q.add(temp.left);
        if(temp.right!=null) q.add(temp.right);
      }
    }

  }

//taking input from user
  static Node takeInput(){
    Scanner sc=new Scanner(System.in);
    Node root=null; //tree initiate
    int Data=sc.nextInt();
    while(Data!=-1){
      root=insertToBST(root,Data);
      Data=sc.nextInt();
    }
    return root;
  }
  //insert node in bst
  static Node insertToBST(Node root,int Data){
    if(root==null){
      Node new_node=new Node(Data);
      root=new_node;
      return root;
    }
    else if(Data>root.val){
     root.right= insertToBST(root.right, Data);
    }
    else{
     root.left= insertToBST(root.left, Data);
    }
    return root;
    
  }
  static void preorder(Node root){
    if(root==null){
      return;
    }
    System.out.print(root.val+" ");
    preorder(root.left);
    preorder(root.right);
  }
    static void inorder(Node root){
    if(root==null){
      return;
    }
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
  //find target in bst
  static boolean search(Node root,int target){
    if(root==null) return false;
    if(root.val==target) return true;
    if(root.val > target){
      return search(root.left,target);
    }
    if(root.val<target){
     return search(root.right,target);
    }
  return false;
  }
  //find min value in bst
  static int Min(Node root){
  Node temp=root;
  while(temp.left!=null){
    temp=temp.left;
  }
    return temp.val;
  }
    //find min value in bst
  static int Max(Node root){
  Node temp=root;
  while(temp.right!=null){
    temp=temp.right;
  }
    return temp.val;
  }


}
