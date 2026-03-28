package oop;

// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//  */

// package oop;

// /**
//  *
//  * @author Rahul 8020
//  */
// public class Majdoor {
// public class Main {
//     public static void main(String[] args) {
//         Employee e1 = new Manager("Rahul", 101, 10000);
//         Employee e2 = new Developer("Amit", 102, 20);

//         e1.getDetails();
//         System.out.println();

//         e2.getDetails();
//     }
// }
// }
// class Employee {
//     String name;
//     int id;

//     Employee(String name, int id) {
//         this.name = name;
//         this.id = id;
//     }

//     double getSalary() {
//         return 0;   // base salary (to be overridden)
//     }

//     void getDetails() {
//         System.out.println("ID: " + id);
//         System.out.println("Name: " + name);
//     }
// }

// // Manager subclass
// class Manager extends Employee {
//     double bonus;

//     Manager(String name, int id, double bonus) {
//         super(name, id);
//         this.bonus = bonus;
//     }

//     @Override
//     double getSalary() {
//         return 50000 + bonus;
//     }

//     @Override
//     void getDetails() {
//         super.getDetails();
//         System.out.println("Role: Manager");
//         System.out.println("Salary: " + getSalary());
//     }
// }

// // Developer subclass
// class Developer extends Employee {
//     int overtimeHours;

//     Developer(String name, int id, int overtimeHours) {
//         super(name, id);
//         this.overtimeHours = overtimeHours;
//     }

//     @Override
//     double getSalary() {
//         return 40000 + (overtimeHours * 500);
//     }

//     @Override
//     void getDetails() {
//         super.getDetails();
//         System.out.println("Role: Developer");
//         System.out.println("Salary: " + getSalary());
//     }
// }

public class Majdoor{
 static  class empolyee{
    int id ;
    String name;

        public empolyee(int id,String name) {
          this.id=id;
          this.name=name;

        }
    
        double getSalary(){
          return 0; // Base case(Berozgar)
        }
        void getdetail(){
          System.out.println("Name: "+name+"\nid: "+id+" ");
        }
    
    
  }
 static class Developer extends empolyee{
    double bonus;

         Developer(int id, String name,double bonus) {
            super(id, name);
            this.bonus=bonus;
        }

        @Override
        double getSalary() {
            return 5000+bonus;
        }
        @Override
        void getdetail(){

          System.out.println("Name: "+name+"\nid: "+id+"\nRole: Developer");
        }  
        
    

  }

 static class Manager extends empolyee{
    double Bonous;
    double overtime;

        public Manager(int id,String name,double Bonous,double overtime) {
            super(id,name);
            this.Bonous=Bonous;
            this.overtime=overtime;

        }

        @Override
        double getSalary() {
            return 25000+Bonous+overtime;
        }
        @Override
        void getdetail(){
           System.out.println("Name: "+name+"\nid: "+id+"\nRole: Manager.");
        }

    
  }
  public static void main(String[] args) {

    Manager m1=new Manager(1,"Rahul",5000,5000);
    m1.getdetail();
    System.out.println("The Salary of "+ m1.name+" are "+m1.getSalary());
    Developer D1=new Developer(2,"Rajmani",25800);
    D1.getdetail();
    System.out.println("THe Salary of "+D1.name+" are "+D1.getSalary());
    
  }


}








