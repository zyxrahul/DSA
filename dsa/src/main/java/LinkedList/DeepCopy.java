package LinkedList;

public class DeepCopy {
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static void main(String[] args) {
    Node a=new Node(10);
    Node b=new Node(20); 
    Node c=new Node(30);
    Node d=new Node(40);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=null;
    Display(a);
    Node Copy= deepCopy(a);
    Display(Copy);

  }
  static void Display(Node head){
    while(head!=null){
      System.out.print(head.data+"--> ");
       if(head.next==null)
        System.out.println("null");
      head=head.next;
      
    }
  }
  public static Node deepCopy(Node head){
    if (head==null) return null;
    Node n= new Node(-1);
    Node temp=head;
    Node temp2=n;
    while(temp!=null){
      Node newnode=new Node(temp.data);
      temp2.next=newnode;
      temp2=temp2.next; //Copy linked list linked
      temp=temp.next;   // traverse on real linked list
      
    }
    return n.next;
  }

  }




