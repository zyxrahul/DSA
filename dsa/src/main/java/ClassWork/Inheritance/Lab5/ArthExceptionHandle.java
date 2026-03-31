package ClassWork.Inheritance.Lab5;

public class ArthExceptionHandle {
  public static void main(String[] args) {
    int m=500;
    int n=0;
    try{
    System.out.println(m/n);
    }
    catch(ArithmeticException e){
      System.out.println("Arithmetic Exception.Divide by zero.");

    } 
  } 
}

