package Backtracking;

public class CountPathOfMaze {
  public static void main(String[] args) {
    int row=4;
    int col=3;
    int count=maze(1,1,row,col);
    System.out.println(count);
  }

  public static int maze(int row, int col, int destRow, int destCol) {
    if (row == destRow && col == destCol) {
      return 1;
    }
    if (row > destRow || col > destCol) {
      return 0;
    }
    int rightPaths = maze(row, col + 1, destRow, destCol);
    int downPaths = maze(row + 1, col, destRow, destCol);
    return rightPaths + downPaths;
  }

}
