//Напишите функцию sortByLength, которая принимает как аргумент строку и сортирует её по длине слова.
//Если длины слов одинаковы, то сортировать в алфавитном порядке. Содержание функции main менять запрещено.
//Спойлер:
//Подключаем import java.util.Arrays;
//Используем метод sort(), который сортирует массив в порядке возрастания.
//Синтаксис Arrays.sort(имя_массива);
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class pz_10_4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        String s = sc.nextLine();
//        sortByLength(s);
//    }
//    public static void sortByLength(String s) {
//        String[] words = s.split(" ");
//
//        Arrays.sort(words, (a, b) -> {
//            int lengthComparison = Integer.compare(a.length(), b.length());
//            if (lengthComparison != 0) {
//                return lengthComparison;
//            } else {
//                return a.compareTo(b);
//            }
//        });
//
//        System.out.println(Arrays.toString(words));
//    }
//}