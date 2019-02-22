import java.util.*;

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> q = new LinkedList<Character>();

        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code
            char[] arr = input.toCharArray();
            boolean isBalanced = true;

            if (arr.length % 2 != 0) {
                System.out.println("false");
                continue;
            }
            if(input.isEmpty()) {
                System.out.println("true");
                continue;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                    q.push(arr[i]);
                } else {
                    try {
                        char current = q.pop().charValue();
                        if (arr[i] == ')' && current != '(') {
                            isBalanced = false;
                            break;
                        } else if (arr[i] == '}' && current != '{') {
                            isBalanced = false;
                            break;
                        } else if (arr[i] == ']' && current != '[') {
                            isBalanced = false;
                            break;
                        }
                    } catch (Exception e) {
                        isBalanced = false;
                        break;
                    }
                }

            }

            System.out.println(isBalanced && q.isEmpty() ? "true" : "false");
            q.clear();
        }

    }
}