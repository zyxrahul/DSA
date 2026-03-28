package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
  public static void main(String[] args) {
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);
    Queue<Integer> help=new LinkedList<>();
    //Normal print
    while(q.size()>0){
      int x=q.poll();
      System.out.print(x+" ");
      help.add(x);
    }
    System.out.println();
    //reverse print
    // System.out.println(q);
    // while(!help.isEmpty()){
    //   int x=help.poll();
    //   System.out.println(x);
    //   q.add(x);
    // }

}
}
