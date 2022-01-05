package PepCoding.BasicsOfProgramming.a2Pattern;

public class Pattern5 {

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sp = n/2;
        int st=1;
        for (int i = 1; i <= n; i++) {

            System.out.println(sp+" "+st);

            if(i<=n/2){
                sp--;
                st += 2;
            }else {
                sp++;
                st -= 2;
            }



        }
    }
}
