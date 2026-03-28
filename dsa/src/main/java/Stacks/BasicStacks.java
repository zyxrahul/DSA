package Stacks;

import java.util.Stack;

public class BasicStacks {
  public static void main(String[] args) {
    Stack <Integer> st=new Stack<>();
    st.push(25);
    st.push(5);
    st.push(125);
    st.push(52);
    st.push(65);
    st.push(95);
    System.out.println(st);
    System.out.println(st.peek());
    st.pop();
    System.out.println(st);
     System.out.println(st.peek());
  }

}
