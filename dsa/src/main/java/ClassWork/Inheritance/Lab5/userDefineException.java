package ClassWork.Inheritance.Lab5;

import java.util.Scanner;

public class userDefineException {
  static class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
  public static void main(String[] args) {
    
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter age: ");
   int age = sc.nextInt();
   try {
            if (age < 18) {
                throw new InvalidAgeException("Under age!");
            }
            System.out.println("Allowed");
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
  }

}
