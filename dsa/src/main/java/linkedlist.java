public class linkedlist {

 public static class node{
    int data;
    node next;
    node(int data){
      this.data=data;
    }
  }
  public static class linkedList{
    node head=null;
    node tail=null;
    void insertAtBegain(int val){
      node temp=new node(val);
      if(head==null){//Empty case
        tail=head=temp;
      }
      else{ // non empty case
        temp.next=head;
        head=temp;
      }
      
    }
    void  insertAtEnd(int val){
      node temp=new node(val);
      if(head==null){
        head =temp;
      }
      else{
        tail.next=temp;

      }
      tail=temp;
    }
    void  display(){
      node temp=head;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }

    }
    // size
    int size(){
      int count=0;
     node temp=head;
      while(temp!=null){
        count++;
        temp=temp.next;
      }
    return count;
  }
  
  }

  public static void main(String[] args) {
      
    linkedList ll=new linkedList();
    ll.insertAtEnd(5);
    ll.insertAtEnd(11);
    ll.display();
    System.out.println();
    System.out.println("The length of linked list is:"+ll.size());
    ll.insertAtBegain(121);
    ll.insertAtBegain(22);
    ll.display();
    System.out.println( );
    System.out.println("The length of linked list is:"+ll.size());

  }

}
