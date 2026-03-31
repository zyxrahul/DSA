package ClassWork.Inheritance.Lab5;

public class ThreadInheritance {
 public static class Mythread extends Thread{
  public void run(){
    for(int i=1;i<11;i=i+2){
      System.out.println(i);
      try {
          Thread.sleep(500);

      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  }
  public static class ourthread implements Runnable{
    public void run(){
      for(int i=2;i<11;i=i+2){
        System.out.println(i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
          System.out.println(e.getMessage());
        }
      }
    }

  }

  
  public static void main(String[] args) {
    Mythread t1=new Mythread();
    Runnable t2=new ourthread();
    t1.start();
    Thread t3=new Thread(t2);
    t3.start();
    
  }

}
