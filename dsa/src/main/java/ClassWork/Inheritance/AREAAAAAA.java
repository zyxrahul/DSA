package ClassWork.Inheritance;

public class AREAAAAAA {
  public static void main(String[] args) {
    AREAAAAAA obj=new AREAAAAAA();
    System.out.println("The Area of circle is "+obj.Area(5.3));
     System.out.println("The Area of Rectangle is "+obj.Area(5,6.3));
       System.out.println("The Area of Square is "+obj.Area(200));

    }
 double Area(double r){
  return 3.14*r*r; 
 }
  double Area(double a,double b){
  return a*b; 
 }
   int  Area(int side){
  return side*side; 
 }
}
