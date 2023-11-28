//// Необходимо написать программу для поиска площади и периметра квадрата или круга.
//// Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры
//// и одно целое число (либо радиус круга, либо сторону квадрата). Как результат они выводят периметр
//// и площадь фигуры соответственно. В ответ они должны вывести именно целое число
//// (при надобности округлять "вверх", то есть до ближайшего большего целого числа). Пи брать как 3.14.
//// П.С. Метод Math.ceil () - округление вверх. Округляет аргумент до ближайшего большего целого.
//
//
//import java.util.Scanner;
//
//public class pz_10_2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите фигуру: ");
//        String n = sc.nextLine();
//        if(n.equals("квадрат")){
//            System.out.println("Введите сторону квадрата: ");
//            Double a = sc.nextDouble();
//            perimeterKvadrat(a);
//            areaKvadrat(a);
//        } else if(n.equals("круг")){
//            System.out.println("Введите радиус круга: ");
//            Double r = sc.nextDouble();
//            perimeterKrug(r);
//            areaKrug(r);
//        } else{
//            System.out.println("Программа ищет площадь и периметр квадрата или круга. Эта фигура не подходит :( ");
//        }
//
//    }
//    public static void perimeterKvadrat(double a){
//        double p = 4 * a;
//        System.out.println("Периметр = " + Math.ceil(p));
//    }
//    public static void perimeterKrug(double r){
//        double p = 2 * 3.14 * r;
//        System.out.println("Периметр = " + Math.ceil(p));
//    }
//    public static void areaKvadrat(double a){
//        double s = a * a;
//        System.out.println("Площадь = " + Math.ceil(s));
//    }
//    public static void areaKrug(double r){
//        double s = 3.14 * (r * r);
//        System.out.println("Площадь = " + Math.ceil(s));
//    }
//}
