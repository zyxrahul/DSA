package Backtracking;

public class printPermutation {
  static int count=0;
public static void main(String[] args) {
  String str="abcd";
  printp(str,"");
}
public static void printp(String str,String s){
 
  if(str.equals("")){
    count++;
    System.out.println(count+ ".  "+ s);
    return;
  }
  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    String left=str.substring(0, i);
    String right=str.substring(i+1);
    String rem=left+right;
    printp(rem, s+ch);
  }
}
}
