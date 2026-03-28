package ClassWork.Inheritance;

public class Shape2 {
  interface  shape{
    void getArea();
    void getPerimeter();
  }
public static class circle implements shape{
    int r;
    @Override
    public void getArea(){
      System.out.println("The Area of Circle is "+3.14*r*r);
    }
    @Override
   public  void getPerimeter(){
      System.out.println("The perimeter of Circle is "+2*r*3.14);
    }
  }
    
public static class rectangle implements shape{
    int a,b;
        public rectangle(int a,int b) {
          this.a=a;
          this.b=b;

        }

    @Override
    public void getArea(){
      System.out.println("The Area of Rectangle is "+a*b);
    }
    @Override
   public  void getPerimeter(){
      System.out.println("The perimeter of Rectangle is "+2*(a+b));
    }
  }
  public static void main(String[] args) {
    circle c1=new circle();
    c1.r=5;
    c1.getArea();
    c1.getPerimeter();
    rectangle r1=new rectangle(5,2);
    r1.getArea();
    r1.getPerimeter();


  }
}


