package pz_11;

import java.util.Scanner;

public class pz_11_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(king_step(x1, y1, x2, y2));
    }
    static int i = 0;
    static String king_step(int x1, int y1, int x2, int y2){
        if(x1==x2 && y1==y2)
            return "3";
        if((x1>8 || x1<1) || (y1>8 || y1<1))
            return "1";
        if((x2>8 || x2<1) || (y2>8 || y2<1))
            return "2";
        if((x1-x2)<=1 && (y1-y2)<=1)
            return "YES :)";
        else return "NO :(";
    }
}
