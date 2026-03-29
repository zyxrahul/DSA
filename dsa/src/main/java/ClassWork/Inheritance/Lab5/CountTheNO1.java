package ClassWork.Inheritance.Lab5;

import java.util.Scanner;

public class CountTheNO1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your string: ");
    String s=sc.nextLine();
    detail(s);
  }
  public static void detail(String s){
    int l=s.length();
    int d,v,c,e;
    d=v=c=e=0;
    for(int i=0;i<l;i++){
      int ch=s.charAt(i);
      if(ch<=57 && ch>=48){
        d++;
      }
     else if(ch<=122 && ch>=97 || ch<=90 && ch>=65){
       if(ch==97||ch==101||ch==105||ch==111||ch==117||ch==65||ch==69||ch==73||ch==79||ch==85){
        v++;
       }
       else{
        c++;
       }
    }
    else{
      e++;
    }
    }
    System.out.println("The number of Vowel: "+v);
    System.out.println("The number of consonants: "+c);
    System.out.println("The number of Digit: "+d);
    System.out.println("The number of special character: "+e);
  }


}

// Method 2
// package ClassWork.Inheritance.Lab5;

// import java.util.Scanner;
// public class CountTheNO1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your string: ");
//         String s = sc.nextLine();
//         detail(s);
//     }

//     public static void detail(String s) {
//         int d = 0, v = 0, c = 0, e = 0;

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             // Digit
//             if (ch >= '0' && ch <= '9') {
//                 d++;
//             }
//             // Alphabet
//             else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
//                 // Vowel
//                 if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
//                     ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
//                     v++;
//                 } else {
//                     c++;
//                 }
//             }
//             // Special character
//             else {
//                 e++;
//             }
//         }

//         System.out.println("The number of Vowel: " + v);
//         System.out.println("The number of consonants: " + c);
//         System.out.println("The number of Digit: " + d);
//         System.out.println("The number of special character: " + e);
//     }
// }

//Write code push
