package Stacks;

public class ArrayImplementation {
  public static class Stack{
    private int[] arr = new int[5];
    private int idx=0;
    void  push(int Data){
      if(idx==arr.length){
        System.out.println("Stack overflow.");
      }
    arr[idx]=Data;
    idx++;
    }
    int pop(){
      if(idx==0){
        System.out.println("Stack is underflow.");
        return -1;
      }
      int top=arr[idx-1];
      arr[idx-1]=0;
      idx--;
      return top;
    }
    int peek(){
    if(idx==0){
        System.out.println("Stack is underflow.");
        return -1;
      }  
    return arr[idx-1];
    
  }
  int size(){
    return idx;
  }
  boolean isEmpty(){
    if(idx==0) return true;
    else return false;
  }
  boolean isFull(){
    if(idx==arr.length) return true;
    else return false;
  }
  int capacity(){
    return arr.length;
  }

void Display(){
  for(int i=0;i<idx;i++){
    System.out.print(arr[i]+" ");

  }
  System.out.println();
  }
}

  public static void main(String[] args) {
    Stack st=new Stack();
    st.push(10);//10
    st.Display();
    st.push(20);
    st.Display();
    st.push(30);
    st.Display();
    st.push(30);
    st.Display();
    st.push(30);
    st.Display();
    // st.push(30);
    // st.Display();

    st.pop();
    st.Display();
      st.pop();
    st.Display();
      st.pop();
    st.Display();
      st.pop();
    st.Display();
      st.pop();
    st.Display();
      st.pop();
    st.Display();
      st.pop();
    st.Display();
    System.out.println(st.capacity());
    System.out.println(st.isEmpty());
    System.out.println(st.isFull());

  }

}
