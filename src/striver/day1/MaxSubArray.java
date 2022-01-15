package striver.day1;

import java.util.ArrayList;

public class MaxSubArray {
    // Java program to print largest
// contiguous array sum

    public static int maxSubArray(int[] nums, ArrayList<Integer> subarray) {
        int msf=nums[0] , meh=0 ;
        int s=0;
        for(int i=0;i<nums.length;i++){
            meh+=nums[i];
            if(meh>msf)
            {
                subarray.clear();
                msf=meh;
                subarray.add(s);
                subarray.add(i);

            }
            if(meh<0)
            {
                meh=0;
                s=i+1;

            }
        }

        return msf;
    }
    public static void main(String args[])
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        ArrayList<Integer> subarray=new ArrayList<>();
        int lon=maxSubArray(arr,subarray);
        System.out.println("The longest subarray with maximum sum is "+lon);
        System.out.println("The subarray is ");
        for(int i=subarray.get(0);i<=subarray.get(1);i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
/*
-> We will have the following variables in the beginning :

        msf – max so far, meh – max end here, start – to get the starting index of ans’s subarray, end – to get the ending index of ans’s subarray.

        -> Traverse the array starting with adding the ith element with max_end_here(meh) , now we will check that adding the element gives greater value than max_so_far(msf) , if yes then we will update our meh and also update the starting and ending index .

        for(int i=0;i<nums.size();i++){

        meh+=nums[i];

        if(meh>msf){ msf=meh; start=s; end=i; }

        if(meh<0){meh=0; s=i+1;}

        }

        ->Now in this step, we will print the answer subarray using the start and end variables.

        ->Return the largest subarray sum that is:- msf. */
