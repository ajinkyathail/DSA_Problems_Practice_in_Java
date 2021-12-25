package com.company.BasicsOfProgramming.a5string;

public class TimeCalculation {
    public static void main(String[] args) {
        int n = 10000;
        long start = System.currentTimeMillis();
//        String s = "";
//        for (int i = 0; i < n; i++) {
//            s += i;
//        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
           sb.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
