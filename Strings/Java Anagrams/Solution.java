import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            int counterA = 0;
            int counterB = 0;
            char character = Character.toLowerCase(a.charAt(i));
            for (int j = 0; j < a.length(); j++) {
                if (Character.toLowerCase(a.charAt(j)) == character)
                    counterA++;
                if (Character.toLowerCase(b.charAt(j)) == character)
                    counterB++;
            }

            if (counterA != counterB)
                return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}