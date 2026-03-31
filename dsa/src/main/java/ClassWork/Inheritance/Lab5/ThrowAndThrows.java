package ClassWork.Inheritance.Lab5;

public class ThrowAndThrows {
  public static void partyclub(int age) throws Exception{
    if(age<18){
      throw new Exception("Under Age! Not allowed!");

    }
    else{
      System.out.println("WElcome inside..");
    }

  }
  public static void main(String[] args) {
    try{
      partyclub(15);
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
    
  }

}
