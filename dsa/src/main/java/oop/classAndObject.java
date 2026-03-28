package oop;

public class classAndObject {
  public static class shape{
    String color;
    
    shape(){
      
    }
    public  shape(String color){

    this.color=color;
   }

  }

  public static void main(String[] args) {
      shape s1=new shape();
      s1.color="Blue";
      shape s2=new shape("Red");
      System.out.println(s1.color);

  }
}
