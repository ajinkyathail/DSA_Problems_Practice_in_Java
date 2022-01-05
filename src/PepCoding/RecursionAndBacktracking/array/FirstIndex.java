package PepCoding.RecursionAndBacktracking.array;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextByte();
        }

        int d = sc.nextInt();
        int fi = firstIndex(arr, 0, d);
        System.out.println(fi);
    }
        public static int firstIndex(int[] arr,int idx,int x){
            if(idx == arr.length){
                return -1;
            }
            if(arr[idx] == x) {
                return idx;
            }else{
                int fisa = firstIndex(arr, idx + 1, x);
                return fisa;
        }

    }
}
