package com.company.BasicsOfProgramming.a5string;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = "hello";
        String s2 = sc.nextLine();
        String s3 = sc.next();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            System.out.print(ch);

        }
    }
}
