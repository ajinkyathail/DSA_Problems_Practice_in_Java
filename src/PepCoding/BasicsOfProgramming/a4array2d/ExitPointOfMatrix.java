package PepCoding.BasicsOfProgramming.a4array2d;

import java.util.Scanner;

public class ExitPointOfMatrix {
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
        int dir = 0; //0-East || 1-South || 2-West || 3-North
        int i = 0;
        int j = 0;

        while(true){
            dir = (dir + arr[i][j]) % 4;
            if(dir == 0){
                j++;
            }else if(dir == 1){ //south
                i++;
            }else if(dir == 2){ //west
                j--;
            }else if(dir == 3){ //north
                i--;
            }
            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++;
                break;
            }else if(i == arr.length){
                i--;
                break;
            }else if(j == arr.length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
