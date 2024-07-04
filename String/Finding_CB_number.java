package String;

public class Finding_CB_number {
    public static void main(String[] args) {
        String str = "81615";
        System.out.println(PrintSubstring(str));

    }

    public static int PrintSubstring(String str) {
        int count = 0;
        boolean[] visited = new boolean[str.length()];
        for (int len = 1; len <= str.length(); len++) {
            for (int si = 0; si <= str.length() - len; si++) {
                int ei = si + len; // ei-si=len

                String s = str.substring(si, ei); // CB number
                // String to int--> Integer.parseInt();
                // String to Long--> Long.parseLong();
                if (isCBNumber(Long.parseLong(s)) == true && isvisited(visited, si, ei - 1) == false) {
                    // visited marked
                    for (int i = si; i <= ei - 1; i++) {
                        visited[i] = true;
                    }
                    count++;
                }

            }
        }
        return count;
    }

    private static boolean isvisited(boolean[] visited, int si, int ei) {
        for (int i = si; i <= ei; i++) {
            if (visited[i] == true) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCBNumber(long n) {
        int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        // point 1
        if (n == 0 || n == 1) {
            return false;
        }
        // point 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        // ppoint 3
        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) { // arr ke aak bhi number is divisible nhi hiona chayea
                return false;
            }
        }
        return true;
    }
}
