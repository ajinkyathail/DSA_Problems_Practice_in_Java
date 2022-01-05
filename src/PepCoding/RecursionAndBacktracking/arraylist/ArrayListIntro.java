package PepCoding.RecursionAndBacktracking.arraylist;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
//        String str ="hello";
//        System.out.println(str);
//        char ch = str.charAt(0);
//        System.out.println(ch);
//        for (int i = 0; i < str.length(); i++) {
//            char p = str.charAt(i);
//            System.out.println(p);
//        }
//        String ss = str.substring(2,4);
//        System.out.println(ss);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list + "->" + list.size());

//        for(int val: list){
//            System.out.println(val);
//        }

        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            System.out.println(val);
        }
        list.set(2,300);
        System.out.println("use 'set' replace value ==>"+list + "->" + list.size());
        list.add(2,3000);
        System.out.println("use 'add' to add more value without replace ==>"+list+"->"+list.size());

    }


}
