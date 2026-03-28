package ClassWork.Inheritance;
public class Calci {
  public static void main(String[] args) {
    Calculator c1=new Calculator();
    System.out.println("The product is: "+c1.multi(1, 2));
     System.out.println("The product is: "+c1.multi(1, 2,3));
      System.out.println("The product is: "+c1.multi(1.10f, 2));
  }
  static class Calculator{
    int multi(int a,int b){
      return a*b;
    }
    
    int multi(int a,int b,int c){
      return a*b*c;
    }
    float multi(float  a,float b){
      return (a*b);
    }
  }

}
