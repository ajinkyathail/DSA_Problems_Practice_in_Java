package PepCoding.BasicsOfProgramming.a3function;

import java.util.Scanner;

public class BaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int b = sc.nextInt();

        int n = 1172;
        int b = 8;
        int d = getValueIndecmial(n,b);
        System.out.println(d);
    }

    private static int getValueIndecmial(int n, int b) {
        int rv =0;
        int p =1;
        while(n>0){
            int dig = n%10;
            n=n/10;
            rv +=  dig*p;
            p=p*b;
        }
        return rv;
    }

}
