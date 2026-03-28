package Stacks;
import java.util.Stack;
public class prefixToPostfix {
  public static void main(String[] args) {
    String prefix="-9/*+5346"; // 953+4*61-
    Stack<String> val=new Stack<>();
    for(int i=prefix.length()-1;i>=0;i--){  //TRaverse in prefix from last index
      char ch=prefix.charAt(i);
      int Asc=ch;
      if(Asc>=48 && Asc<=57){
        val.push(""+ch);
      }
      else{
        String x=work(val.pop(), val.pop(), ch);
        val.push(x);

      }

    }
    System.out.println("The Expression of prefix to postfix is "+val.peek());
  }
  static  String work(String y, String x,char c){ // y=v1 x=v2 because we traverse from last index
  
      return y+x+c;
   
    }

}
