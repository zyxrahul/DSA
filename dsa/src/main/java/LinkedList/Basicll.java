package LinkedList;

public class Basicll {
  public static class node{
    int data;
    node next;
    node(int data){
      this.data=data;
    }
  }
  public static void main(String[] args) {

    //Data store
    node a=new node(2);
    node b=new node(3);
    node c=new node(4);
    node d=new node(6);
    node e=new node(8);
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(d);
    // System.out.println(e);
    
    // linked one data by another data using next 
    
    a.next=b; // a ->b
    b.next=c; // b->c
    c.next=d; // c->d
    d.next=e; // d->e
     // a-> b -> c -> d ->e  linkedlist
    //  System.out.println(a);
    // System.out.println(b);
    // System.out.println(a.next.next.next.data);
    // System.out.println(d);
    // System.out.println(e);

    node temp=a;
    while (temp!=null) {
      System.out.print(temp.data+" ");
      temp=temp.next;
      
    }


  }

}
