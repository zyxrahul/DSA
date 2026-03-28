package oop;
  class grandfather{
    grandfather(){
      System.out.println("GrandFather");
    }
  }
    class parents extends grandfather{
    parents(){
      System.out.println("Parents ");
    }
  }
   class child extends parents{
    child(){
      System.out.println("Child");
    }
  }

public class OrderofConstructorExecutation {
 public static void main(String[] args){
  child obj=new child();
 }
}
