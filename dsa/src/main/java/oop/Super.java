package oop;

public class Super {
  public static class parents{
    int x;

         parents(int x) {
          this.x=x;

        }
    
    void display(){
      System.out.println(x+10);
    }
  }
  public  static class child extends parents{

        public child(int x) {
          super(x);
        }
        // void display(){
        //   System.out.println("BAccha Party.");
        // }

        public static void main(String[] args) {
            child c1=new child(5);
            c1.display();
        }


  }


  

}
