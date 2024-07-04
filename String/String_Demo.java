package String;

public class String_Demo {
    public static void main(String[] args) {
        String st="hello";  // suppose 'hello' AT LOCATION 6K THEN STR WILL CONTAIN 6K
        String str1="hello";  //6k
        String st1=new String("hello"); // it will form in heap at loacation 19k suppose
        String st2=new String("hello"); // it will form in heap at loacation 20k suppose
        str1=str1+"bye";
        st1=st1+"bye";
        System.out.println(str1.length());
     }
}
