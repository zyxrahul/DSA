package Stacks;

public class LinkedLIstIMplementation {
  static class Node{
   int val;
   Node next;
   Node(int val){
    this.val=val;
    this.next=null;

   }
  }
  static class Stack{
    Node head=null;
    int size=0;
    void push(int data){
      Node temp=new Node(data);
      temp.next=head;
      head=temp;
      size++;
      
    }
    int pop(){
      if(head==null){
        System.out.println("Stack underflow. ");
        return -1;
      }
      Node p=head;
      head=head.next;
      size--;
      return p.val;
    }
    // Sidha LInked list print
    void Displayrec(Node h){ //recursive function
      if(h==null) return;
      Displayrec(h.next);
      System.out.print(h.val+" ");
    }
    void Display(){ // helpher function
      Displayrec(head);
      System.out.println();
    }

    void Displayrev(){  //Reverse Stack print
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
      }
      System.out.println();
    }
    int Size(){
      return size;
    }
    int peek(){
      if(head==null){
        System.out.println("Stack is Empty.");
        return -1;
      }
      return head.val;
    }
    boolean isEmpty(){
      if(head==null) return true;
      else return false;
    }
  }
  public static void main(String[] args) {
    Stack st=new Stack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.Display();
    st.pop();
    st.Display();
    System.out.println(st.isEmpty());
    System.out.println(st.peek());
    System.out.println(st.pop());
    st.pop();
    st.Display();
    st.pop();


    
  }

}
