package ClassWork.Inheritance.Lab5;

public  class Synchrozied {
  static   class counter{
    int count=0;
    public synchronized void increment(){
     count++;
    }
  }

 static class Mythread implements Runnable{
    counter c;

        public Mythread(counter c) {
          this.c=c;
        }
        public void run(){
          for(int i=0;i<1000;i++){
            c.increment();
          }
        }
    
  }
 static  class ourthread extends Thread{
    counter o;

        public ourthread(counter o) {
          this.o=o;
        }
    public void run(){
      for(int i=0;i<1000;i++){
        o.increment();
      }
    }    
    
    

  }

  public static void main(String[] args) {
    counter c=new counter();
    Mythread t1=new Mythread(c);
    Thread t3=new Thread(t1);
    ourthread t2=new ourthread(c);
    t3.start();
    t2.start();
    try {
        t3.join();
        t2.join();
    } catch ( Exception e) {
    }
    System.out.println(c.count);
    
  }

}
