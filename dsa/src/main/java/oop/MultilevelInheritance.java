package oop;  
class grandfather{
    void display(){
      System.out.println("GrandFather");
    }
  }
    class parents extends grandfather{
    void display(){
      System.out.println("Parents ");
    }
  }
   class child extends parents{
    void  display(){
      System.out.println("Child");
    }
  }


public class MultilevelInheritance {

  public static  void main(String[] args) {
    // grandfather g1=new grandfather();
    // g1.display();
    // parents p1 =new parents();
    // p1.display();
    // child c1=new child();
    // c1.display();

    grandfather c1=new child();
    c1.display();



    
  }

}
