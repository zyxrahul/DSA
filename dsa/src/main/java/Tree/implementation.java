package Tree;
class Node{
  int val;
  Node left;
  Node  right;
  Node(int x){
    val=x;
  }
}
public class implementation {
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
  Display(n1);
  System.out.println();
  System.out.println("Size of Tree: "+size(n1));
  System.out.println("sum of number in tree: "+sum(n1));
  System.out.println("product of number in tree: "+product(n1));
  System.out.println("Max number in tree: "+max2(n1));
  System.out.println("Number of Level in tree: "+level(n1));
  System.out.println("Diameter of tree: "+Diameter(n1));


}
// Approach 1of Diameter of tree
private static int Diameter(Node root) {
  if(root==null)return 0;
  int Dia1=Diameter(root.left);
  int Dia2=Diameter(root.right);
  int Dia3=level(root.left)+level(root.right)+1;
  return Math.max(Dia3, Math.max(Dia1, Dia2));


}
// level Method for find number of level in a tree
static int level(Node root){
  if(root==null) return 0;
  return 1+Math.max(level(root.left),level(root.right));
}
//max method for return max number in tree
static int max2(Node root){
  if(root==null) return Integer.MIN_VALUE;
  return Math.max(root.val,Math.max(max2(root.left), max2(root.right)));

}
//product method for all number present in tree
static int product(Node root){
  if(root==null) return 1;
  int productleft=product(root.left);
  int productright=product(root.right);
  return root.val*productleft*productright;
}
//sum method for sum of all number present in tree
static int sum(Node root){
   if(root==null) return 0;
   int sumleft=sum(root.left);
   int sumright=sum(root.right);
   return root.val+sumleft+sumright;
 

}
// size method
static  int size(Node root){
  if(root==null) return 0;
  return 1+size(root.left)+size(root.right);
}
//
static void Display(Node root){
  if(root ==null) return;
  Display(root.left);
  System.out.print(root.val+" ");
  Display(root.right);
  //Right ko print karega
}
}
