package ClassWork.Inheritance.Lab5;

public class stringBuilderMethod {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("Rahul");
    sb.append("kumar");
    sb.insert(5,'_');
    System.out.println(sb);
    sb.replace(0, 5, "RAHUL");
    System.out.println(sb);
    sb.delete(6,12);
    System.out.println(sb);
  }

}
