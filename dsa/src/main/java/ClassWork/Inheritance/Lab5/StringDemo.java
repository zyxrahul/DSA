package ClassWork.Inheritance.Lab5;

public class StringDemo {
    public static void main(String[] args) {

        // 1️⃣ String (Immutable)
        String s = "Hello";
        s.concat(" World");  // does NOT change original string
        System.out.println("String: " + s);

        // 2️⃣ StringBuffer (Mutable, Thread-safe)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // modifies original object
        System.out.println("StringBuffer: " + sb);

        // 3️⃣ StringBuilder (Mutable, Not Thread-safe)
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");  // modifies original object
        System.out.println("StringBuilder: " + sb2);
    }
}


