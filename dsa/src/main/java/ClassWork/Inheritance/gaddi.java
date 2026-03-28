package ClassWork.Inheritance;

import java.util.Scanner;

public class gaddi {
  interface  vehical{
    void start();
  }
  public static class car implements  vehical{
    String name;
    car(String name){
      this.name=name;
    }
  @Override
    public void start(){
      System.out.println("The "+name+" car is satrting. ");
    }
  }
    public static class Bike implements vehical{
    String name;
    Bike(String name){
      this.name=name;
    }
   @Override
    public void start(){
      System.out.println("The "+name+" Bike is satrting. ");
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    car c1=new car("BMW");
    Bike b1=new Bike("Bullet");
   
    c1.start();
    b1.start(); 
    System.out.print("Enter THE Car name: ");
    String carname=sc.next();

     vehical c2=new car(carname);
    c2.start();  
 
  }
}
