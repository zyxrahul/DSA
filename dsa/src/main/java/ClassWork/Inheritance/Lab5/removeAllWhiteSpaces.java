package ClassWork.Inheritance.Lab5;

import java.util.Scanner;

public class removeAllWhiteSpaces {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your string: ");
    String s=sc.nextLine(); 
    
    replace(s);
  }
  public static void replace(String s){
    String p=s.replace(" ", "");
    System.out.println(p);
  }

}
