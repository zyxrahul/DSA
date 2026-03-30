package ClassWork.Inheritance.Lab5;

import java.util.Scanner;

public class FrequencyOfAllcharacter {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.print("Enter your string: ");
    String s=sc.nextLine(); 
    freq(s);
    
  }
  public static void freq(String s){
    int n=s.length();
    for(int i=0;i<n;i++){
      int count=0;
      char ch=s.charAt(i);
      //check for Skipping recount
      boolean visited = false;
        for(int k = 0; k < i; k++){
            if(s.charAt(k) == ch){
                visited = true;
                break;
            }
        }

        if(visited) continue; // skip current loop
      for(int j=0;j<n;j++){
        if(ch==s.charAt(j)){
          count++;
        }
      }
      System.out.println("The occurance of "+ch+" is "+count+" times.");

      
    }
  }

}
