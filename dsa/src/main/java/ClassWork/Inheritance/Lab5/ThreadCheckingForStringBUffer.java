package ClassWork.Inheritance.Lab5;

public class ThreadCheckingForStringBUffer {
  static class test extends Thread{
    StringBuilder s;

        public test(StringBuilder s) {
          this.s=s;
        }

        public void run(){
          for(int i=0;i<5;i++){
            s.append(Thread.currentThread().getName());
          }
      

        }
    
  }
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder();
    test t1=new test(sb);
    test t2=new test(sb);
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
        
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(sb);
    
  }

}
