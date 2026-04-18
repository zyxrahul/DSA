package Backtracking;

public class printPathOfMaze {
  public static void main(String[] args) {
    int row=4;
    int col=3;
    print(1,1,row,col,"");
  }
  public static void print(int sr,int sc,int er,int ec,String s) {
 if(sr>er || sc>ec) return;
 if(sr==er && sc==ec){
  System.out.println(s);
  return;
 }
 
 print(sr, sc+1, er, ec, s+"R");

 print(sr+1, sc, er, ec, s+"D");

      
  }

}
