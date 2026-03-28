package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequentElement {
  static int Mostfreq(int[] arr){
  HashMap<Integer,Integer> hs=new HashMap<>();
  for(int i=0;i<arr.length;i++){
    if(hs.containsKey(arr[i])){
      hs.put(arr[i],hs.get(arr[i])+1);
    }
    else{
      hs.put(arr[i], 1);
    }
  }
  int maxfreq=0;
  int maxKey=-1;
  for (var e:hs.entrySet()){
  if(maxfreq<e.getValue()){
    maxfreq=e.getValue();
    maxKey=e.getKey();
  }
  }
  return maxKey;
  //return Collections.max(hs.entrySet(), Map.Entry.comparingByValue()).getValue();
  }
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Size of array: ");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println();
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }
    printarr(arr);
    int freq=Mostfreq(arr);
    System.out.println(freq);
  }
  static void printarr(int[] arr){
    System.out.print("Array: ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();

  }

}
