package HashMap;

import java.util.*;

public class PersonAgeCollection {
 static void hashmap(){
  HashMap<String,Integer> hs=new HashMap<>();
  hs.put("Akash",21);
  hs.put("yash",16);
  hs.put("Lav",17);
  hs.put("Rishika",19);
  hs.put("Harry",18);

  for(Map.Entry<String,Integer> e: hs.entrySet()){
    System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());

  }
  }


public static void main(String[] args){

hashmap();
 }
 
}
