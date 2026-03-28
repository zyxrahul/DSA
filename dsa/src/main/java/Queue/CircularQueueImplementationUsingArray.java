package Queue;

public class CircularQueueImplementationUsingArray {
  static class queue{
    int[] arr=new int[10];
    int size=0,front=-1,rear=-1;
    int len=arr.length;
    void push(int x){
      if(size==0){
        arr[0]=x;
        front=rear=0;
        size++;
      }
     else if(size==len) System.out.println("queue Overflow !");
     else if(rear<len-1){
      arr[++rear]=x;
      size++;
     }
     else if(rear==len-1){
      arr[0]=x;
      rear=0;
      size++;
     }
    }
    int poll(){
      int ans;
      if(size==0) 
        {System.out.println("Queue UnderFlow !");
         return -1;
       }
       else if(front<rear){
        ans=arr[front];
        front++;
        size--;
        return ans;
      
       }
       else if(front==len-1){
        ans=arr[front];
        front=0;
        size--;
        return ans;
    
       }
      return 0;
    }
  void Display(){
    if(front<=rear){
      for (int i = front; i <=rear; i++) {
        System.out.print(arr[i]+" ");
      }
    }
    else{
      for (int i = front; i < len; i++) {
          System.out.print(arr[i]+" ");
      }
      for (int i = 0; i <= rear; i++) {
        System.out.print(arr[i]+" ");
          
      }
    }
    System.out.println();
  }

    
    }
  public static void main(String[] args) {
    queue q=new queue();
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);
    q.push(6);
    q.push(7);
    q.push(8);
    q.push(9);
    q.push(10);
    q.push(11);
    q.Display();
    System.out.println(q.poll());
    q.push(12);
    q.Display();
    
  }

}
