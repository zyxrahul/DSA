package Stacks;
import java.util.Stack;

public class ReverseSTACK {
  static void reverseStack(Stack<Integer> st){
    if(st.size()==1) return;
    int top=st.pop();
    reverseStack(st);
    pushAtbottom(st,top);
  }
   public static void pushAtbottom(Stack<Integer> st,int val){
    if(st.isEmpty()){
      st.push(val);
       return;
       }
     int top=st.pop();
    pushAtbottom(st,val);
    st.push(top);
  }
  public static void main(String[] args) {
  Stack<Integer> st=new Stack<>();
  st.push(1);
  st.push(2);
  st.push(3);
  st.push(4);
  st.push(5);
  System.out.println(st);
  // reverseStack(st);
  // System.out.println(st);

  //Now we do ir iterative
  Stack<Integer> qt=new Stack<>();
  while(!st.isEmpty()){
    qt.push(st.pop());
  } 
  System.out.println(qt);

  Stack<Integer> rt=new Stack<>();
  while(!qt.isEmpty()){
    rt.push(qt.pop());
  } 
  System.out.println(rt);

  while(!rt.isEmpty()){
    st.push(rt.pop());
  }
  System.out.println(st);

}
}