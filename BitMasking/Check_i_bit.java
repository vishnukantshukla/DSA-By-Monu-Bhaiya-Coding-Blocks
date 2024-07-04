public class Check_i_bit {
    public static void main(String[] args) {
        int num = 86;
        int pos = 2;

        System.out.println(isSet(num, pos));
    }

    public static boolean isSet(int n, int pos) {
        n = n >> pos;
        if ((n & 1) == 0) {
            return false;
        }
        return true;
    }
}
