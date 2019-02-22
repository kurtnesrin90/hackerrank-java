import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int total, opp, sum = 1;
        long before = System.currentTimeMillis();

        total = 0;
        for (int j = 2; j * j <= n; j++) {

            if (j * j == n) {
                total++;
                sum += j;
            } else {
                if (n % j == 0) {
                    sum += j + n/j;
                    if (j % 2 == 0)
                        total++;

                    opp = n / j;
                    if (n % opp == 0 && opp % 2 == 0) {
                        total++;
                    }
                }
            }
        }
        total++;
        // System.out.println(total);
        return n == 1 ? n : sum+n;    
    }
}
class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}