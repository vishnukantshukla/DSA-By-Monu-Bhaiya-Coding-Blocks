package String;

public class String_Demo2 {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hello";
        String st = new String("hello");
        String st1 = new String("hello");
        System.out.println(st1 == st);  // == address compare karta hai
        System.out.println(st1.equals(st)); // .equals basically compare the content...
    }
}
