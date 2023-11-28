////Площадь треугольника можно вычислить по формуле Герона. Напишите программу с функцией geron,
//// которая по трём действительным числам находит площадь треугольника и выводит её на экран.
//// Если такого треугольника не существует, то выведите на экран "Такого треугольника не существует".
//
//import java.util.Scanner;
//
//public class pz_10_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите стороны трегольника: ");
//        System.out.print("Введите a: ");
//        double a = sc.nextInt();
//        System.out.print("Введите b: ");
//        double b = sc.nextInt();
//        System.out.print("Введите c: ");
//        double c = sc.nextInt();
//        geron(a, b, c);
//    }
//
//    public static void geron(double a, double b, double c) {
//        double p = (a + b + c) / 2;
//        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//        if (s > 0) {
//            System.out.print("Треугольник существует и его площадь = " + s);
//        } else {
//            System.out.print("Треугольник не существует");
//        }
//    }
//}
