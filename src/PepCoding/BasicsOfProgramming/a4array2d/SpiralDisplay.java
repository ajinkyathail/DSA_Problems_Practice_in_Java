package PepCoding.BasicsOfProgramming.a4array2d;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr = arr.length -1;
        int maxc = arr[0].length-1;
        int tne = n * m;
        int cnt = 0;

        while (cnt < tne){
            for(int i = minr; i <= maxr && cnt < tne; i++){
                System.out.println(arr[i][minc]);
                cnt++;
            }
            minc++;

            for(int j = minc; j <= maxc && cnt < tne; j++){
                System.out.println(arr[maxr][j]);
                cnt++;
            }
            maxr--;

            for(int i = maxr; i >= minr && cnt < tne; i--){
                System.out.println(arr[i][maxc]);
                cnt++;
            }
            maxc--;

            for(int j = maxc; j >= minc && cnt < tne; j--){
                System.out.println(arr[minr][j]);
                cnt++;
            }
            minr++;
        }

    }

}
