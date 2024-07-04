package String;

public class String_Demo3 {
    public static void main(String[] args) {
        String str = "abcdef";
        String s1 = str.substring(2, 6);
        System.out.println(str.charAt(3));
        System.out.println(str.substring(0, 4));// substring (last index se aak kaam chale ga)
        System.out.println(str.substring(2));
        System.out.println(str.substring(1, 1));
        System.out.println(str.concat(s1)); // it is used for concatenation
        String s2 = "abde";
        System.out.println(str.compareTo(s2)); // according to lexicography order compare karega dictionoary wise (ascii ka difference leta)...
        if(str.compareTo(s2)>0){
            System.out.println("str is greater acscii value" + str);
        }
        else{
            System.out.println(s2);
        }
    }
}
