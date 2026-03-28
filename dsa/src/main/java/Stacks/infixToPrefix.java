package Stacks;

import java.util.Stack;

public class infixToPrefix {
  public static void main(String[] args) {
     String infix="9-(5+3)*4/6"; 
    Stack<String> val=new Stack<>();
    Stack<Character> op=new Stack<>();
    for(int i=0;i<infix.length();i++){
      char ch=infix.charAt(i);
      int Asc=(int)ch;
      if(Asc>=48 && Asc <=57){
        val.push(String.valueOf(ch));
      }
      else if(op.isEmpty() || ch=='(' || op.peek()=='(') op.push(ch);
      else if(ch==')'){
        while(op.peek()!='('){
          String x = work(val.pop(),val.pop(),op.pop());
          val.push(x);

        }
        op.pop();
      }
      else{
        if(ch=='+' || ch=='-'){
         
          String x=work(val.pop(),val.pop(),op.pop());
          val.push(x);
           op.push(ch);
        }
       else if(ch=='*' || ch=='/'){
         if(op.peek()=='*' || op.peek()=='/'){
          String x=work(val.pop(),val.pop(),op.pop());
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
          String x =work(val.pop(),val.pop(),op.pop());
          val.push(x);
    }
    System.out.println(val.peek());

  }
 static  String work(String x, String y,char c){
  
      if(c=='+') return "+"+y+x;
      if(c=='-') return "-"+y+x;
      if(c=='*') return "*"+y+x;
      if(c=='/') return "/"+y+x;
      return null;
    }
  

}
