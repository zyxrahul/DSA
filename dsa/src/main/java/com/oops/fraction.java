package com.oops;
public class fraction {
  static int   gcd(int x,int y){
    int min=Math.min(x, y);
    for(int i=min;i>=1;i--){
      if(x%i==0 && y%i==0) {
        return i;
      }
    }
    return min;
  }

  public static class vinna{ // user define data type
    int num;
    int den;
    public vinna(int num,int den){  // constructor
      this.num=num;
      this.den=den;
      simplyfy();
    }
      void simplyfy(){  // create simplyfy method
      int hcf=gcd(num,den);
      num=num/hcf;
      den=den/hcf;
    }
      }
   public static void main(String[] args) {
    System.out.println("hello world !");
    vinna f1=new vinna(5,7);
    vinna f2=new vinna(5,25);
    System.out.println(f1.num+"/"+f1.den);
    System.out.println(f2.num+"/"+f2.den);
    vinna add=sum(f1, f2);
    vinna sub=sub(f1,f2);
    System.out.println("Add: "+add.num+"/"+add.den);
    System.out.println("sub: "+sub.num+"/"+sub.den);
    

  }
  public static vinna sum(vinna x,vinna y){
    int n=x.num*y.den + y.num*x.den;
    int d=x.den*y.den;
    return  new vinna(n,d);

  }
  public static vinna sub(vinna x,vinna y){
    int n=x.num*y.den - y.num*x.den;
    int d=x.den*y.den;
    return  new vinna(n,d);

  }

}