package Stacks;
import java.util.Stack;
public class prefixEvaluation {
  public static void main(String[] args) {
    String prefix="-9/*+5346";
    Stack<Integer> val=new Stack<>();
    for(int i=prefix.length()-1;i>=0;i--){  //TRaverse in prefix from last index
      char ch=prefix.charAt(i);
      int Asc=ch;
      if(Asc>=48 && Asc<=57){
        val.push(Asc-48);
      }
      else{
        int x=work(val.pop(), val.pop(), ch);
        val.push(x);

      }

    }
    System.out.println("The Expression of prefix is "+val.peek());
  }
  static  int work(int y, int x,char c){ // y=v1 x=v2 because we traverse from last index
  
      if(c=='+') return y+x;
      if(c=='-') return y-x;
      if(c=='*') return y*x;
      if(c=='/') return y/x;
      return 0;
    }
  

}
