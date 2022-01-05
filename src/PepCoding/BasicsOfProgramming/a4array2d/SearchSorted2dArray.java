package PepCoding.BasicsOfProgramming.a4array2d;

import java.util.Scanner;

public class SearchSorted2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][]= new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        // search
        int i = 0;
        int j = arr[0].length - 1;
        while(i < arr.length && j >= 0){
            if(x == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            } else if(x > arr[i][j]){
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Not Found");
    }

}
