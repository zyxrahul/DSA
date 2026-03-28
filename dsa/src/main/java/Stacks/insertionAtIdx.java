package Stacks;

import java.util.Stack;

public class insertionAtIdx {
  public static void main(String[] args) {
   Stack<Integer> st=new Stack<>();
   st.push(20);
   st.push(120);
   st.push(200);
   st.push(2);
   st.push(201);
   System.out.println(st);
   insertion(st,2,523);
   System.out.println(st);

}
static Stack<Integer> insertion(Stack<Integer> a,int Idx,int val){
  Stack<Integer> b=new Stack<>();
  while(a.size()>Idx){
    b.push(a.pop());
  }
  a.push(val);
  // while(b.size()>0){
  while(!b.isEmpty()){
    a.push(b.pop());
  }
  return a;
}
}
