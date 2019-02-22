import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet();
        BitOperation opr;

        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();

        for (int i = 0; i < m; i++) {
            String[] operands = in.nextLine().split("\\s");
            opr = BitOperation.valueOf(operands[0]);
            int first = Integer.parseInt(operands[1]);
            int second = Integer.parseInt(operands[2]);
            // b1 = BitSet.valueOf(operands[1].getBytes());
            // b2 = BitSet.valueOf(operands[2].getBytes());

            switch (opr) {
            case AND:
                if (first == 1)
                    b1.and(b2);
                else
                    b2.and(b1);
                break;
            case OR:
                if (first == 1)
                    b1.or(b2);
                else
                    b2.or(b1);
                break;
            case XOR:
                if (first == 1)
                    b1.xor(b2);
                else
                    b2.xor(b1);
                break;
            case SET:
                if (first == 1)
                    b1.set(second, true);
                else
                    b2.set(second, true);
                break;
            case FLIP:
                if (first == 1)
                    b1.flip(second);
                else
                    b2.flip(second);
                break;
            default:
                break;
            }
            System.out.println(print(b1) + " " + print(b2));
        }
    }

    public static long convert(BitSet bits) {
        long value = 0L;
        for (int i = 0; i < bits.length(); ++i) {
            value += bits.get(i) ? (1L << i) : 0L;
        }
        return value;
    }

    public static long print(BitSet bits) {
        int value = 0;
        for (int i = 0; i < bits.length(); ++i) {
            value += bits.get(i) ? 1 : 0;
        }
        return value;
    }

    enum BitOperation {
        AND("AND"), OR("OR"), XOR("XOR"), FLIP("FLIP"), SET("SET");

        String op;

        private BitOperation(String op) {
            this.op = op;
        }
    }
}