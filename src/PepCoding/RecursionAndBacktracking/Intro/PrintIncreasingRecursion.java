package PepCoding.RecursionAndBacktracking.Intro;

import java.util.Scanner;

public class PrintIncreasingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IncreasingNumber(n);
    }

    private static void IncreasingNumber(int n) {
        if (n == 0) {
            return;
        }
        IncreasingNumber(n-1);
        System.out.println(n);
    }
}
