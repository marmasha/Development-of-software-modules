package pz_11;

import java.util.Scanner;

public class pz_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        //записать функцию сюда
        if (n == 0) {
            return 1;
        }
        return factorial(n-1) * n;
    }
}
