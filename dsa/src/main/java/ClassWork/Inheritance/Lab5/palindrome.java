package ClassWork.Inheritance.Lab5;

import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER YOUR STRING: ");
    String s=sc.nextLine();
    palindrome(s);
  }
   static void palindrome(String s){
    int n=s.length();
   StringBuffer temp=new StringBuffer("");
    for(int i=n-1;i>=0;i--){
      char ch=s.charAt(i);
      temp.append(ch);
    }
    if(s.equals(temp.toString())){
      System.out.print("The String is palindrome.");
    }
    
    else{
      System.out.print("The String is Not palindrome.");

    }

  }

}
