package oop;
class shape{
  shape(){
    System.out.println("Shape is Described.");
  }
}
class circle extends shape{
  int r;

     circle(int r) {
      this.r=r;
    }
     void displayArea(){
      System.out.println("The area of circle : "+(3.14*r*r));

    }
  
}
class rectangle extends shape{
  int l;
  int b;

     rectangle(int l,int b) {
      this.l=l;
      this.b=b;
    }

  void displayArea(){
    System.out.println("The area of Rectangle is: "+(2*l*b));
  }  
  
}

public class Akkar {
  public static void main(String[] args) {
      circle c1=new circle(2);
      c1.displayArea();
      rectangle r1=new rectangle(51,2);
      r1.displayArea();
  }

}
