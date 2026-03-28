package Stacks;

import java.util.Stack;


public class infix {

  public static void main(String[] args) {
    String str="9-(5+3)*4/4"; 
    Stack<Integer> val=new Stack<>();
    Stack<Character> op=new Stack<>();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      int Asc=(int)ch;
      if(Asc>=48 && Asc <=57){
        val.push(Asc-48);
      }
      else if(op.isEmpty() || ch=='(' || op.peek()=='(') op.push(ch);
      else if(ch==')'){
        while(op.peek()!='('){
          int x=work(val.pop(),val.pop(),op.pop());
          val.push(x);

        }
        op.pop();
      }
      else{
        if(ch=='+' || ch=='-'){
         
          int x=work(val.pop(),val.pop(),op.pop());
          val.push(x);
           op.push(ch);
        }
       else if(ch=='*' || ch=='/'){
         if(op.peek()=='*' || op.peek()=='/'){
          int x=work(val.pop(),val.pop(),op.pop());
          val.push(x);
          op.push(ch);
         }
         else{
          op.push(ch);
         }

        }
      }

    }
    while(val.size()>1){
          int x=work(val.pop(),val.pop(),op.pop());
          val.push(x);
    }
    System.out.println(val.peek());

  }
 static  int work(int x, int y,char c){
  
      if(c=='+') return y+x;
      if(c=='-') return y-x;
      if(c=='*') return y*x;
      if(c=='/') return y/x;
      return 0;
    }
}
