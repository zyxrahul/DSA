package ClassWork.Inheritance.Lab5;

public class MultipleException {
  public static void main(String[] args) {
    int [] arr=new int[5];
    int m=20;
    int n=0;
    try {
      //  arr[10]=100;
       System.out.println(m/n);
       System.out.println(arr[8]);
        
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index is  Error occurred.");
    }
    catch(ArithmeticException e){
      System.out.println("Divisible by zero...");

    } finally {
      System.out.println("Finally....");
    }
  }

}
