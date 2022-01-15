package striver.day1;

public class SortArray012 {
    // Java implementation of the approach
        // Utility function to print the contents of an array
        static void printArr(int arr[], int n)
        {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }

        // Function to sort the array of 0s, 1s and 2s
        static void sortArr(int nums[], int n)
        {
            int lo = 0;
            int hi = nums.length - 1;
            int mid = 0;
            int temp;
            while (mid <= hi) {
                switch (nums[mid]) {
                    case 0: {
                        temp = nums[lo];
                        nums[lo] = nums[mid];
                        nums[mid] = temp;
                        lo++;
                        mid++;
                        break;
                    }
                    case 1:
                        mid++;
                        break;
                    case 2: {
                        temp = nums[mid];
                        nums[mid] = nums[hi];
                        nums[hi] = temp;
                        hi--;
                        break;
                    }
                }
            }
            printArr(nums, n);
        }
            // Print the sorted array



        // Driver code
        public static void main(String[] args)
        {
            int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
            int n = arr.length;
            sortArr(arr, n);
        }
    }




