package pz_11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class pz_11_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int routes = countRoutes(n);
            System.out.println(routes);
        }

        public static int countRoutes(int n) {
            Map<Integer, Integer> cash = new HashMap<>();
            if (n < 0) {
                return 0;
            }
            if (n == 0) {
                return 1;
            }
            if(cash.containsKey(n)){
                return cash.get(n);
            }
            int count = countRoutes(n-1) + countRoutes(n-2) + countRoutes(n-3);
            cash.put(n, count);
            return count;
        }
}
