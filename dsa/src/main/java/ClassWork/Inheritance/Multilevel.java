package ClassWork.Inheritance;

public class Multilevel {
  static class grandfather{
     grandfather(){
      System.out.println("grandfather");
     }
  }
  static  class parents extends grandfather{

         parents() {
          System.out.println("Parents");
        }
    
  }
  static  class child extends parents{
         child() {
          System.out.println("child");
        }
    
  }


  public static void main(String[] args) {
    // grandfather g1=new grandfather();
    // parents p1=new parents();
    child c1=new child();
    
  }

}
