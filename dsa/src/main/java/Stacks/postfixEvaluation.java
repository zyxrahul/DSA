package Stacks;

import java.util.Stack;

public class postfixEvaluation {
  public static void main(String[] args) {
    String postfix="82/3*4-62/+"; //11
    Stack<Integer> val=new Stack<>();
    for(int i=0;i<postfix.length();i++){  //TRaverse in postfix
      char ch=postfix.charAt(i);
      int Asc=ch;
      if(Asc>=48 && Asc<=57){
        val.push(Asc-48);
      }
      else{
        int x=work(val.pop(), val.pop(), ch);
        val.push(x);

      }

    }
    System.out.println("The Expression of postfix is "+val.peek());
  }
  static  int work(int x, int y,char c){
  
      if(c=='+') return y+x;
      if(c=='-') return y-x;
      if(c=='*') return y*x;
      if(c=='/') return y/x;
      return 0;
    }

}
