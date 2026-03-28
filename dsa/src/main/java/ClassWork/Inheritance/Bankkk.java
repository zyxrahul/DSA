package ClassWork.Inheritance;

public class Bankkk {
  public static void main(String[] args) {
    Bank B1=new Axis();
    B1.RateofIntrest();
    ICICI I1=new ICICI();
    I1.RateofIntrest();
  }
static   class Bank{
    void RateofIntrest(){
      System.out.println("Rate of intrest");
    }
  }
 static  class Axis extends Bank{
    double rate=10;
    void  RateofIntrest(){
      System.out.println("The Rate of intrest of Axis Bank is: "+rate);
    }
  }
  static  class ICICI extends Bank{
    double rate=11;
    void  RateofIntrest(){
      System.out.println("The Rate of intrest of ICICI Bank is: "+rate);
    }
  }
}

