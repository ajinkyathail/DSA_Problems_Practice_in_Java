package PepCoding.BasicsOfProgramming.a1start;
import java.util.Scanner;
public class CountDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 7859;
        int dig=0;
        while(n != 0){
            n=n/10;
            dig++;
        }
        System.out.println(dig);
    }
}