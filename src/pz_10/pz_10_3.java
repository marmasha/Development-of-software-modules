//Напишите программу, которая содержит функцию simple, принимающую одно целое число и определяет,
//является ли число простым и выводит на экран ответ: "YES"/"NO".

//import java.util.Scanner;
//
//public class pz_10_3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int n = sc.nextInt();
//        simple(n);
//    }
//    public static void simple(int n) {
//        boolean c = true;
//
//        if (n <= 1) {
//            c = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    c = false;
//                    break;
//                }
//            }
//        }
//        System.out.println("Результат: ");
//        if (c) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}
