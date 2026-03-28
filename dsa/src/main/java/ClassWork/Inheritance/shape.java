package ClassWork.Inheritance;

public class shape {
  abstract static class shapee{
      abstract void getArea();
      abstract void parameter();

  }
  static class circle extends shapee{
    int r;
    void getArea(){
      System.out.println("The area of circle is: "+3.14*r*r);
      
    }
    void parameter(){
      System.out.println("The parameter of circle is "+2*3.14*r);
    }
  }
  static class square extends shapee{
    int r;
    void getArea(){
      System.out.println("The area of square is: "+r*r);
      
    }
    void parameter(){
      System.out.println("The parameter of square is "+(r+r+r+r));
    }
  }

  public static void main(String[] args) {
    circle c1=new circle();
    c1.r=5;
    c1.getArea();
    c1.parameter();
    square s1=new square();
    s1.r=10;
    s1.getArea();
    s1.parameter();
  }

}
