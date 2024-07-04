package Wrapper_Class;

public class Wrapper_demo {
    public static void main(String[] args) {
        Integer a = 100;
        int a1 = 11087;
        System.out.println(a);
        System.out.println(a1);
        Short s1 = 79; // class
        Byte b1 = 19; // class
        System.out.println(s1);
        System.out.println(b1);
        a = a1; // int--> Integer (Autoboxing --> int ko Integer me rakha hai)
        System.out.println(a);
        int ii = 100;
        int i = 10;
        i = ii; // Integer--> int (unboxing --> Integer ko int me rakh rahe hai )
        System.out.println(i);
        Integer b11 = 19;
        Integer b2 = 19;
        System.out.println(b11 == b2);  // same address value same hogi yesliya true aa raha hai
        Integer c1 = 190;  //yeh 2k p bane gaa koye yeh range ke bhar chala gya -127 to 128
        Integer c2 = 190; //yeh 3k p bane gaa koye yeh range ke bhar chala gya -127 to 128
        System.out.println(c1 == c2); // different address hone ki bjhe se yeh false de raha hai...
    }
}
