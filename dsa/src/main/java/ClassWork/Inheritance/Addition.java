package ClassWork.Inheritance;

public class Addition {
 static class add{
    int sum(int a,int b){
      return a+b;
    }
    int sum(int a,int b,int c){
      return a+b+c;
    }
    double sum(double a,double b){
      return  a+b;
    }
  }
  public static void main(String[] args) {
    add obj =new add();
    System.out.println("The sum of : "+obj.sum(1, 2, 3));
    System.out.println("The sum of : "+obj.sum(1, 21));
    System.out.println("The sum of : "+obj.sum(1, 12, 3));
    System.out.println("The sum of : "+obj.sum(1, 2.32));


  }
}
