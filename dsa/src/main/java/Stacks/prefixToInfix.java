package Stacks;
import java.util.Stack;
public class prefixToInfix {

    public static void main(String[] args) {
    
    String prefix="-9/*+5346";
    Stack<String> infix=new Stack<>();
    for(int i=prefix.length()-1;i>=0;i--){
      char ch=prefix.charAt(i);
      int Asc=ch;
      if(Asc>=48 && Asc<=57){
        infix.push(""+ch);
      }
      else{
        String v1=infix.pop();
        String v2=infix.pop();
        String Ans="("+v1+ch+v2+")";
        infix.push(Ans);
      }
    }
    System.out.println(infix.peek());
    }
}


