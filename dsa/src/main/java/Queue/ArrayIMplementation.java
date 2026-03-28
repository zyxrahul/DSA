package Queue;

public class ArrayIMplementation {
 static  class queue{
    int[] arr=new int[50];
    int front=0;
    int rear=-1;
    void add(int x){
      rear++;
      arr[rear]=x;
    }
    int poll(){
      int prev=front;
      front++;
      return arr[prev];
    }
    void Display(){
      for (int i = front; i <= rear; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
  int Size(){
    return (rear-front)+1;
  }
  boolean isEmpty(){
    if(front==rear) return true;
    else return false;
  }
  int peek(){
    return arr[front];
  }

  }

  public static void main(String[] args) {
    queue q=new queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.Display();
    q.poll();
    q.poll();
    q.Display();
    System.out.println(q.peek());
    System.out.println(q.isEmpty()  );

    
  }

}
