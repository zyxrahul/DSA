package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class nQueens {
  public static void main(String[] args) {
    int n=4;
    char [][] board=new char[n][n];

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        board[i][j]='.';
      }
    }
    List<List<String>> ans=new ArrayList<>();
    nqueen(board,0,ans);
    
    for(List<String> list : ans){
      System.out.println(list);
    }
      
  }



  private static void nqueen(char [][]board,int row,List<List<String>> ans){
    int n=board.length;
    //base case
    if(row==n){
      List<String> l=new ArrayList<>();
      for(int i=0;i<n;i++){
        String str="";
        for(int j=0;j<n;j++){
          str+=board[i][j];
        }
        l.add(str);
      }
      ans.add(l);

      return;
    }
    for(int j=0;j<n;j++){
      if(isSafe(board,row,j)){
        board[row][j]='Q';
        nqueen(board, row+1,ans);//recursive
        board[row][j]='.';  //backtracking
      }
    }
  }
  private static boolean isSafe(char [][]board,int row,int col){
    int n=board.length;
    //check agal-bagal
    for(int i=0;i<n;i++){
      if(board[row][i]=='Q')return false;
    }
    //check uper - niche
    for(int i=0;i<n;i++){
      if(board[i][col]=='Q'){
        return false;
      }
    }
    //check north east
    int i=row;
    int j=col;
    while(i>=0 && j<n){
      if(board[i][j]=='Q')return false;
      i--;
      j++;
    }

    //check East south
    i=row;
    j=col;
    while(i<n && j<n){
      if(board[i][j]=='Q')return false;
      i++;
      j++;
    }
    //check west south
    i=row;
    j=col;
    while(i<n && j>=0){
      if(board[i][j]=='Q')return false;
      i++;
      j--;
    }
    //Check west North
    i=row;
    j=col;
    while(i>=0 && j>=0){
      if(board[i][j]=='Q')return false;
      i--;
      j--;
    }
    return true;
  }

}
