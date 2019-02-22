import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static List<Integer> l = new ArrayList<>();

    public static void main(String[] args) {
        // Using try with source
        try (Scanner scan = new Scanner(System.in)) {
            // Get number of integers
            int n = Integer.parseInt(scan.nextLine());

            // Parse integers as a String array
            String[] sArray = scan.nextLine().split("\\s");

            // Add integers to list
            for (String str : sArray) {
                l.add(Integer.parseInt(str));
            }

            // Get number of queries
            int q = Integer.parseInt(scan.nextLine());

            // Get operation and operands
            for (int i = 0; i < q; i++) {
                String op = scan.nextLine();
                String[] operands;

                if (op.equalsIgnoreCase("Insert")) {
                    operands = scan.nextLine().split("\\s");
                    l.add(Integer.parseInt(operands[0]), Integer.parseInt(operands[1]));
                } else if (op.equalsIgnoreCase("Delete")) {
                    operands = scan.nextLine().split("\\s");
                    l.remove(Integer.parseInt(operands[0]));
                } else
                    System.out.println("Unrecognized operation.");
            }

            for (Integer i : l)
                System.out.print(i + " ");
        }
    }
}