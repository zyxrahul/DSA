package LinkedList;

public class ReverseLinkedList {
  public static class node{
    int Data;
    node next;
    node(int val){
      this.Data=val;
    }

  }
  public  static void main(String[] args) {
   node a=new node(3);
   node b=new node(5);
   node c=new node(1);
   node d=new node(2);
   node e=new node(4);

   a.next=b;
   b.next=c;
   c.next=d;
   d.next=e;
   Display(a);
   node rev=reverse(a);
   System.out.println();
   Display(rev);



  }
    public static void Display(node a){
      if(a==null) return;
      System.out.print(a.Data+" ");
      Display(a.next);
    }
    // public static node reverse(node head){
    //   node curre=head;
    //   node prev=null;
    //   node after=null;
    //   while(curre != null){
    //     after=curre.next;
    //     curre.next=prev;
    //     prev=curre;
    //     curre=after;
    //   }
    //   return prev;

    // }
    // using Recursion
    public static node reverse(node head){
      if(head.next==null) return head;
      node newhead= reverse(head.next);
      head.next.next=head;
      head.next=null;
      return  newhead;
    }
  
  }


