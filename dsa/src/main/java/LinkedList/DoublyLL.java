package LinkedList;

public class DoublyLL {
  static  class Node{
  int val;
  Node next;
  Node prev;
  Node(int data){
    val=data;
  }
  }
  static Node AddAtHead(int data,Node head){
    Node t= new Node (data);
    t.next=head;
    head.prev=t;
    head=t;
    return head;
  }
  static Node AddAtTail(int data,Node head){
    Node t=new Node(data);
    Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }
    //Now temp at tail
    t.prev=temp;
    temp.next=t;
    return head;
  }
  static Node AddAtIndx(int Idx,int data,Node head){
    Node s=head;
    Node r=new Node(data);
    for(int i=1;i<=Idx-1;i++){
      s=s.next;
    }
    Node t=s.next;

    t.prev=r;
    r.prev=s;
    s.next=r;
     r.next=t;

    return head;
  }
  public static void main(String[] args) {
    Node a=new Node(4);
    Node b=new Node(10);
    Node c=new Node(2);
    Node d=new Node(99);
    Node e=new Node(13);
    //Create doubly linked list
    a.prev=null;
    a.next=b;
    b.prev=a;
    b.next=c;
    c.prev=b;
    c.next=d;
    d.prev=c;
    d.next=e;
    e.prev=d;
    e.next=null;
    Display(a);
  //   Displayrev(e);
  //   DisplayRandom(c);
  //  Display( AddAtHead(76, a));
  //  Display(AddAtTail(154, a));
   Display(AddAtIndx(2, 58, a));

  }
  static void Display(Node head){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    System.out.println();
  }
 static void Displayrev(Node tail){
  Node temp=tail;
  while(temp!=null){
    System.out.print(temp.val+" ");
    temp=temp.prev;
  }
  System.out.println();
 }
 static void DisplayRandom(Node random){
  Node temp=random;
  while(temp.prev!=null){
    temp=temp.prev;
  }

   while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    System.out.println();

 }

}
