package oop;
class empolyee{

  int id;
  int salary;
  String name;

  empolyee(int id,String name,int salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
  }

    void display(){
    System.out.println("Name: "+name+"\nid: "+id+"\nSalary: "+salary);
  }
}

public class EmpolyeeDetails {
  public static void main(String[] args) {
  empolyee e1=new empolyee(1,"Rahul",100);
   e1.display();
  }

}
