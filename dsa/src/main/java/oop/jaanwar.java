package oop;

public class jaanwar {
  public static void main(String[] args) {
      Animal A1=new Animal();
      A1.sound();
      Animal D1=new Dog();
      D1.sound();
      Animal C1 =new cat();
      C1.sound();
      Animal Co1=new cow();
      Co1.sound();

  }
  public static class Animal{
    void sound(){
      System.out.println("Bolega.");
    }
  }
  public static class Dog extends Animal{
      void sound(){
      System.out.println("Barking");
    }
     
  }
    public static class cat extends Animal{
      void sound(){
      System.out.println("Mew.");
    }
  }
    public static class cow extends Animal{
      void sound(){
      System.out.println("Grazing.");
    }
  }

}
