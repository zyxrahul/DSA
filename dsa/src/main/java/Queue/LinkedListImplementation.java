package Queue;

public class LinkedListImplementation {
  static class node{
    int val;
    node next;
    node(int val){
      this.val=val;
      this.next=null;
    }
  }
  static class queue{
    node head=null;
    node tail=null;
    void push(int x){ 
      node temp=new node(x);
      if(head==null && tail==null) {
        head=temp;
        tail=head;
      }
      else{
        tail.next=temp;
        tail=tail.next;
      }
    }
    int poll(){
      if(head==null && tail==null) return -1;
      else{
        int ans=head.val;
        head=head.next;
        return ans;

      }

    }
    void Display(){
      node temp=head;
      while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
      }
      System.out.println();
    }
    int size(){
      int x=0;
      node temp=head;
      while(temp!=null){
        temp=temp.next;
        x++;
      }
      return x;

    }
    int peek(){
      return  head.val;

    }
    boolean isEmpty(){
      if(head==null) return true;
      else return false;

    }

    
  }
  public static void main(String[] args) {
    queue q=new queue();
    System.out.println(q.isEmpty());
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);
    q.push(6);
    q.Display();
    System.out.println(q.poll());
    q.Display();
    q.isEmpty();
    System.out.println(q.size());
    
  }

}
