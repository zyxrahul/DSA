package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class copyofStack {
  public static void Displayrev(Stack<Integer> st){
    if(st.isEmpty()) return;
    int top=st.pop();
    System.out.print(top+" ");
    Displayrev(st);
    st.push(top);
  }
  public static void Display(Stack<Integer> st){
    if(st.isEmpty()) return;
    int top=st.pop();
    Display(st);
    System.out.print(top+" ");
    st.push(top);
  }
    public static void pushAtbottom(Stack<Integer> st,int val){
    if(st.isEmpty()){
      st.push(val);
       return;
       }
     int top=st.pop();
    // System.out.print(top+" ");
    pushAtbottom(st,val);
    st.push(top);
  }
  


  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Stack<Integer> st=new Stack<>();
    
  
    System.out.print("Enter the size of stack: ");
    int n= sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print("Enter the "+(i+1)+"th element: ");
      int x=sc.nextInt();
      st.push(x);
    }
    // System.out.println();
    // System.out.println(st);
    // Stack<Integer> rs=new Stack<>();
    // while(!st.isEmpty()){
    //   rs.push(st.pop());
    // }
    // System.out.println("The reverse of above stack are: "+rs);
    // Stack<Integer> rs2=new Stack<>();
    // while(rs.size()>0){
    //   rs2.push(rs.pop());
    // }
    //  System.out.println("The reverse of above stack or You can say same order as initial stack: "+rs2);
    System.out.println(st);
    Display(st);
    System.out.println();
     Displayrev(st);
     pushAtbottom(st,25);
     System.out.println(st);
  }
}
