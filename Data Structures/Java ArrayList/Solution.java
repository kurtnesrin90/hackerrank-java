import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int line = scanner.nextInt();
        scanner.nextLine();
        int query;
        int row;
        int col;
        ArrayList<List<Integer>> outerList = new ArrayList<>();
        ArrayList<Integer> innerList;
        for (int i = 0; i < line; i++) {
            try {
                innerList = new ArrayList<>();
                String[] lineElements = scanner.nextLine().split("\\s");
                for (String s : lineElements)
                    innerList.add(Integer.parseInt(s));

                outerList.add(innerList);
            } catch (InputMismatchException e) {
                // swallow
            }
        }

        query = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < query; i++) {
            row = scanner.nextInt();
            col = scanner.nextInt();
            printSpecific(outerList, row, col);
        }
    }

    static void print(List<List<Integer>> outerList) {
        for (List<Integer> l : outerList)
            for (Integer i : l)
                System.out.println(i);
    }

    static void printSpecific(List<List<Integer>> outerList, int row, int col) {
        try {
            System.out.println(outerList.get(row - 1).get(col));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR!");
        }
    }
}