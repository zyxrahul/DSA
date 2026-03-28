package Stacks;
import java.util.Stack;
public class PostfixToPrefix {
   public static void main(String[] args) {
    String postfix="953+4*6/-"; // -953+4*6/-
    Stack<String> val=new Stack<>();
    for(int i=0;i<postfix.length();i++){  //TRaverse in prefix from last index
      char ch=postfix.charAt(i);
      int Asc=ch;
      if(Asc>=48 && Asc<=57){
        val.push(""+ch);
      }
      else{
        String x=work(val.pop(), val.pop(), ch);
        val.push(x);

      }

    }
    System.out.println("The Expression of postfix to prefix is "+val.peek());
  }
  static  String work(String y, String x,char c){ // y=v2 x=v1 because we traverse from first index    
    //op v1 v2  for prefix
     return c+x+y;
    }


}
