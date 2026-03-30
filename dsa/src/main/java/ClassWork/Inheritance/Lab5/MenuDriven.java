package ClassWork.Inheritance.Lab5;

import java.util.Scanner;

public class MenuDriven {

  public static void main(String[] args) {
    int choice;
    
    Scanner sc=new Scanner(System.in);
    StringBuilder sb=new StringBuilder();
    StringBuilder green=new StringBuilder("\u001B[32m");
    StringBuilder blue=new StringBuilder("\u001B[34m");
    do{
      System.out.println(blue+"*------Menu operation-----*");
      System.out.println("1: Append String");
      System.out.println("2: Insert");
      System.out.println("3: Delete");
      System.out.println("4: Reverse");
      System.out.println("5: Display");
      System.out.println("0:Exit");
      System.out.print("Enter your choice: ");
      choice=sc.nextInt();
      switch (choice) {
          case 1:
              System.out.print("Enter your String for Append: ");
              sb.append(sc.next());
              break;
          case 2:
            System.out.print("Enter index for start inserting: ");    
            int idx=sc.nextInt();
            System.out.println();
            System.out.print("Enter your SubString for insert: ");
            sb.insert(idx, sc.nextLine());
            break;
          case 3:
            System.out.println("Enter Starting index:");
            int start=sc.nextInt();
            System.out.println("Enter your last index: ");
            int end=sc.nextInt();
            sb.delete(start, end);
            break;
          case 4:
            sb.reverse();
            break;
          case 5:
            System.out.println(green.toString()+sb);
            break;
          case 0:
            System.out.println("Exiting.");
            break;
          default:
              System.out.println("pls Enter Right choice..");
      }
    }while(choice!=0);
  }

}
