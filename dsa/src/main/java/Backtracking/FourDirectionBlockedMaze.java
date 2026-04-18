package Backtracking;

public class FourDirectionBlockedMaze {
  public static void main(String[] args) {
    int row=3;
    int col=4;
    int[][]maze={
      {1,0,1,1},
      {1,1,1,1},
      {1,1,0,1}
    };
    boolean [][] isVisited= new boolean[row][col];
    print(0,0,row-1,col-1,"",isVisited,maze);
  }
  public static void print(int sr,int sc,int er,int ec,String s, boolean [] [] isVisited,int[][]maze){
    if(sr<0 || sc < 0){
      return;
    }
    if(sr>er || sc >ec) return;
   
    if(maze[sr][sc]==0) return;
    if(isVisited[sr][sc]==true) return;
    if(sr==er && sc==ec){
      System.out.println(s);
      return;
    }

    isVisited[sr][sc]=true;
    //go right
    print(sr,sc+1,er,ec,s+"R",isVisited,maze);
    //go down
    print(sr+1,sc,er,ec,s+"D",isVisited,maze);
    //go up
    print(sr-1, sc, er, ec, s+"U", isVisited,maze);
    //go left
    print(sr, sc-1, er, ec, s+"L", isVisited,maze);
    isVisited[sr][sc]=false; //Backtracking
  }

}
