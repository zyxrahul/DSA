package Backtracking;

public class optemizeFourDirectionBlockedMaze {
  public static void main(String[] args) {
    int row=3;
    int col=4;
    int[][]maze={
      {1,0,1,1},
      {1,1,1,1},
      {1,1,0,1}
    };
    print(0,0,row-1,col-1,"",maze);
  }
  public static void print(int sr,int sc,int er,int ec,String s,int[][]maze){
    if(sr<0 || sc < 0){
      return;
    }
    if(sr>er || sc >ec) return;
   
    if(maze[sr][sc]==0|| maze[sr][sc]==-1) return;
    if(sr==er && sc==ec){
      System.out.println(s);
      return;
    }

    maze[sr][sc]=-1;
    //go right
    print(sr,sc+1,er,ec,s+"R",maze);
    //go down
    print(sr+1,sc,er,ec,s+"D",maze);
    //go up
    print(sr-1, sc, er, ec, s+"U",maze);
    //go left
    print(sr, sc-1, er, ec, s+"L",maze);
    maze[sr][sc]=1; //Backtracking
  }


}
