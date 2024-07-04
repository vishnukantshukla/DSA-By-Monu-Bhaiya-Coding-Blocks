package StringBuilder;

import java.util.*;

public class StringBuilder_Demo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello"); // yah pe hello add karne se capacity bhi increase ho jayega 16+5
                                                       // = 21 ho jayega..
        System.out.println(sb.capacity());
        // StringPrint(); //yeh thoda slow print karta haai
        // StringBuilderPrint(); // yeh thoda fast print karta hai
        System.out.println(sb.substring(0, 2));
    }

    public static void StringPrint() {
        String s = "";
        for (int i = 0; i <= 100000; i++) {
            s += i;

        }
        System.out.println(s);
    }

    public static void StringBuilderPrint() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= 100000; i++) {
            s.append(i);

        }
        System.out.println(s);
    }
}
