package striver.day3;

public class ArrayAs {
    public static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) ///1. main method
    {
        int[] arr = {44,4,5,56};
        //    index= 0, 1, 2, 3
       /* arr=new int[5];
        arr[0]=44;
        arr[1]=4;
        arr[2]=5;
        arr[3]=56;*/
        int first=0;
        int second=2;

        swap(arr,first,second);
        System.out.println("after");
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
