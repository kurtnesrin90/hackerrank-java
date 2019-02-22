
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
    static Map<String, String> book = new HashMap<>();

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            book.put(name, String.valueOf(phone));
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            String person = book.get(s);
            System.out.println(person == null ? "Not found" : s + "=" + book.get(s));
        }
    }
}