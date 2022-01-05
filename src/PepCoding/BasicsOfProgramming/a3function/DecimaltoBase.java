package PepCoding.BasicsOfProgramming.a3function;

import java.util.Scanner;

public class DecimaltoBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int b = sc.nextInt();
        int n = 634;
        int b = 8;
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    private static int getValueInBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }

}
