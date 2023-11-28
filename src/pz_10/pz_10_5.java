//
//import java.util.Arrays;
//import java.util.Scanner;
//
//
//public class  pz_10_5  {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите количество строк: ");
//        int n = sc.nextInt();
//
//        System.out.println("Введите строки двумерного массива:");
//        int[][] arr = new int[n][];
//
//        for (int i = 0; i < n; i++) {
//            int size = sc.nextInt();
//            arr[i] = new int[size];
//            for (int j = 0; j < size; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int result = maximin(arr);
//        System.out.println(result);
//    }
//
//    public static int maximin(int[][] arr) {
//        int result = Integer.MIN_VALUE;
//
//        for (int[] row : arr) {
//            int min = Arrays.stream(row).min().getAsInt();
//            result = Math.max(result, min);
//        }
//
//        return result;
//    }
//}
