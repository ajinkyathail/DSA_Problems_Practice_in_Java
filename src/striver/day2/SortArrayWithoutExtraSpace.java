package striver.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArrayWithoutExtraSpace {

    static void merge(int nums1[], int nums2[], int n, int m) {
        // code here
        int end = m+n-1;
        int end1 = m -1;
        int end2 = n -1;

        while(end2 >= 0){
            if(end1 >=0){
                nums1[end--] = nums1[end1] > nums2[end2] ? nums1[end1--] : nums2[end2--];
            }else{
                nums1[end--] = nums2[end2--];
            }
        }


    }
    public static void main(String[] args) {
        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,9};
        System.out.println("Before merge:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("After merge:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}

