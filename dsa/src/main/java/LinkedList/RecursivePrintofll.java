package LinkedList;

public class RecursivePrintofll {
  public static class node{
    int data;
    node next;
    node(int data){
      this.data=data;

    }

  }
  public static void main(String[] args) {
    node a= new node(5);
    node b= new node(7);
    node c= new node(11);
    node d= new node(9);
    node e= new node(8);
    // LinkedList
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    //
    displayr(a);
    System.out.println();
    displayb(a);
    int length=leng(a);
    System.out.println("length of linkedList is "+length);
      
  }
  //forward order
  public static void displayr(node head){
    if(head==null) return;
    System.out.print(head.data+" ");
    displayr(head.next);

  }
  // Backward order
    public static void displayb(node head){
    if(head==null) return;
    
    displayb(head.next);
    System.out.print(head.data+" ");
  }

  // length of ll
  public static int leng(node head){
    int count=0;
    while(head != null){
      head=head.next;
      count++;
    }
    return count;
  }

}
