package pz_11;

import java.util.Scanner;

public class pz_11_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for(int i =0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        int ans = find_line7(mas);
        if (ans != -1)
            System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
        else
            System.out.println("Таких строк нет");
    }
public static int sum = 0;
public static int n = 0;
public static int find_line7(int[][] mas){
            sum = 0;
            for(int j = 0; j < mas.length; j++){
                sum += mas[n][j];
        if(sum % 7 == 0 )
            return n;
            }
        n++;
        if(n == mas.length) return -1;
    return find_line7(mas);
}
}
