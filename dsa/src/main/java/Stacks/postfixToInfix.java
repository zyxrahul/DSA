package Stacks;

import java.util.Stack;

public class postfixToInfix {
  public static void main(String[] args) {
    
    String postfix="953+4*6/-";
    Stack<String> infix=new Stack<>();
    for(int i=0;i<postfix.length();i++){
      char ch=postfix.charAt(i);
      int Asc=ch;
      if(Asc>=48 && Asc<=57){
        infix.push(""+ch);
      }
      else{
        String v2=infix.pop();
        String v1=infix.pop();
        String Ans="("+v1+ch+v2+")";
        infix.push(Ans);
      }
    }
    System.out.println(infix.peek());
    }
    



}
