package PepCoding.RecursionAndBacktracking.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }
    //bc->[--,-c,b-,bc]
    //abc->[---,--c,-b-,-bc,a--,a-c,ab-,abc]
    public static ArrayList<String> gss (String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr: rres){
            mres.add("" + rstr);

        }
        for(String rstr:rres){
            mres.add((ch + rstr));
        }
        return mres;
    }
}
