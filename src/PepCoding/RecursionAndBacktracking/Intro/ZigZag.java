package PepCoding.RecursionAndBacktracking.Intro;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 2;

        pzz(n);
    }
    public static void pzz(int n){
        if (n == 0) {
            return;
        }
        System.out.print(n +" "); //pre
        pzz(n -1); //left control
        System.out.print(n +" "); //in
        pzz(n - 1); //right control
        System.out.print(n +" "); //post
    }
}
