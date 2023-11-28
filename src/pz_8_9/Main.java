import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

/*------PZ_8-----------------------------------------------------------------------------*/
//1

//class Main{
//    public static void main(String[] args){
//        ArrayList<Integer> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите n: ");
//        int n = sc.nextInt();
//        list.add(1);
//        for(int i = 0; i < n; i++){
//            list.add(0);
//        }
//        list.add(1);
//        for(Integer m : list){
//            System.out.print(m + " ");
//        }
//    }
//}

//2

//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//        System.out.println("Введите n: ");
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i ++){
//            list.add(String.valueOf(i));
//        }
//        System.out.println("Введите m: ");
//        int m = sc.nextInt();
//        System.out.println("Введите строку: ");
//        String s = sc.next();
//        list.add(m, s);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//    }
//}


//3

//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//        System.out.println("Введите n: ");
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i ++){
//            list.add(String.valueOf(i));
//        }
//        System.out.println("Введите m: ");
//        int m = sc.nextInt();
//        System.out.println("Введите строку: ");
//        String s = sc.next();
//        list.set(m, s);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//    }
//}

//4

//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//        System.out.println("Введите n: ");
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i ++){
//            list.add(String.valueOf(i));
//        }
//        System.out.println("Введите m: ");
//        int m = sc.nextInt();
//        list.remove(m);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//    }
//}


//5

//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите количество запросов: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//        Stack<String> stack = new Stack<>();
//        for(int i =0; i < n; i++){
//            String command = sc.nextLine();
//            String[] parts = command.split(" ");
//            if(parts[0].equals("push")){
//                String item = parts[1];
//                stack.push(item);
//            } else if(parts[0].equals("pop")){
//                String item = stack.pop();
//                System.out.println("Петя взял " + item);
//            }
//        }
//        System.out.print(stack);
//    }
//}


/*------PZ_9-----------------------------------------------------------------------------*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

//1

//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите n: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        Map<String, Integer> c = new HashMap<>();
//        int maxC = 0;
//
//        for (int i = 0; i < n; i++) {
//            String w = sc.nextLine();
//            int count = c.getOrDefault(w, 0) + 1;
//            c.put(w, count);
//
//            if (count > maxC) {
//                maxC = count;
//            }
//        }
//
//        String popular = "";
//        for (Map.Entry<String, Integer> entry : c.entrySet()) {
//            if (entry.getValue() == maxC) {
//                popular = entry.getKey();
//                break;
//            }
//        }
//        System.out.println(popular);
//            }
//        }
//

//2

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        scanner.nextLine();
//
//        Map<String, Integer> professionCount = new HashMap<>();
//        Map<String, String> employees = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            String name = scanner.nextLine();
//            String profession = scanner.nextLine();
//
//            employees.put(name, profession);
//
//            int count = professionCount.getOrDefault(profession, 0);
//            professionCount.put(profession, count + 1);
//        }
//
//        int maxCount = 0;
//        String maxProfession = "";
//
//        for (Map.Entry<String, Integer> entry : professionCount.entrySet()) {
//            String profession = entry.getKey();
//            int count = entry.getValue();
//
//            if (count > maxCount) {
//                maxCount = count;
//                maxProfession = profession;
//            }
//        }
//
//        System.out.println("Количество сотрудников: " + maxCount);
//        System.out.println("Профессия: " + maxProfession);
//
//        for (Map.Entry<String, String> entry : employees.entrySet()) {
//            String name = entry.getKey();
//            String profession = entry.getValue();
//
//            if (profession.equals(maxProfession)) {
//                System.out.println("Имя: " + name);
//            }
//        }
//    }
//}

//3
//
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число n: ");
//        int n = sc.nextInt();
//
//        Set<Integer> numbers = new HashSet<>();
//
//        System.out.println("Введите " + n + " целых чисел:");
//        for (int i = 0; i < n; i++) {
//            int number = sc.nextInt();
//            if (numbers.contains(number)) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//                numbers.add(number);
//            }
//        }
//    }
//}


//4
//
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите количество строк: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        Set<String> distinctWords = new HashSet<>();
//
//        System.out.println("Введите строки:");
//        for (int i = 0; i < n; i++) {
//            String line = sc.nextLine();
//            String[] words = line.split("\\s+"); // Разделение строки на слова
//
//            for (String word : words) {
//                if (!word.isEmpty()) {
//                    distinctWords.add(word);
//                }
//            }
//        }
//
//        int distinctCount = distinctWords.size();
//        System.out.println("Количество различных слов: " + distinctCount);
//    }
//}


//5
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        Map<String, Set<String>> wordsMap = new HashMap<>(); // словарь для хранения слов каждого ребенка
//
//        for (int i = 0; i < n; i++) {
//            String line = scanner.nextLine();
//            String[] split = line.split(": ");
//
//            String name = split[0];
//            String[] words = split[1].split(" ");
//
//            Set<String> uniqueWords = new HashSet<>(); // множество для хранения уникальных слов ребенка
//
//            for (String word : words) {
//                word = word.toLowerCase();
//                uniqueWords.add(word);
//            }
//
//            wordsMap.put(name, uniqueWords);
//        }
//
//        int k = Integer.parseInt(scanner.nextLine());
//
//        String winner = "";
//        int maxCount = 0;
//
//        for (Map.Entry<String, Set<String>> entry : wordsMap.entrySet()) {
//            int count = 0;
//
//            for (String word : entry.getValue()) {
//                if (word.length() >= k) {
//                    count++;
//                }
//            }
//
//            if (count > maxCount) {
//                maxCount = count;
//                winner = entry.getKey();
//            }
//        }
//
//        System.out.println(winner + " " + maxCount);
//    }
//}
