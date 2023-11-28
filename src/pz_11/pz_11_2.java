package pz_11;

import java.util.Scanner;

public class pz_11_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("Секунд прошло: " + second_count(d, h, m,s));
    }
static int second_count(int d, int h, int m, int s){
        int shtuchka = ((d * 86400) + (h * 3600) + (m * 60) + s);
        return shtuchka;
}
}
