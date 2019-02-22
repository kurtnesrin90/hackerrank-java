import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int lineNumber = 0;
        try (Scanner s = new Scanner(System.in)) {
            while (s.hasNext()) {
                System.out.println(++lineNumber + " " + s.nextLine());
            }
        }
    }
}