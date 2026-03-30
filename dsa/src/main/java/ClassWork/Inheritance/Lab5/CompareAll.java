package ClassWork.Inheritance.Lab5;

public class CompareAll {
  public static void main(String[] args) {
    String s1="RAHUL";
    String s2="Rahul";
    System.out.println(s1.equals(s2));

    //Based on ASC value
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));
  }

}
