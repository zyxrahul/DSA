package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeu {

  public static void main(String[] args) {
    Deque<Integer> dq=new LinkedList<>();
    dq.add(5);
     dq.add(20);
      dq.add(80);
       dq.add(320);
       System.out.println(dq);
       dq.addFirst(1);
       System.out.println(dq);



    
  }

}
