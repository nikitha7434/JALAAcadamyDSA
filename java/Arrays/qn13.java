package Arrays;

import java.util.Scanner;

public class qn13 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int size = input.nextInt();
        // creat  array
        int[] arr =new int[size];
        // taking element in input
        for (int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        input.close();
        // second larget number

        /* 1.sort the array using quick sort

        then next fing second largest with out duplicatie number arr[arr.length-1]
         */
        qucikSort(arr,0,size);
     System.out.println("second largest with out duplicate ele :"+ secontlargetEle(arr));
System.out.println("second largest element in with duplicates ele :"+secontlargetElewithDuplicate(arr));
    }

    private static void qucikSort(int[] arr, int first, int last) {


        if(first<last){
            int pi =partisionArr(arr,first, last);
            qucikSort(arr,0,pi-1);
            qucikSort(arr,pi+1,last);
        }


    }

    private static int partisionArr(int[] arr, int first, int last) {

        int low =first;
        int j=low-1;
        int high =last-1;
        int pivot =arr[high];

        for(int i=low;i<=high-1;i++) {
            if (arr[i] <pivot) {
                j++;
                swapArr(arr, j, i);
            }
        }
        swapArr(arr,j+1,high);
        return j+1;
    }


    private static void swapArr(int[] arr, int low, int pivot) {
        int temp =arr[pivot];
        arr[pivot]=arr[low];
        arr[low]=temp;
    }

 private static int secontlargetEle(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

     return arr[arr.length-2];
 }
    private static int secontlargetElewithDuplicate(int[] arr){

        int firstLarger =arr[arr.length-1];
        int j=arr.length-1;
        while(j>=0&&firstLarger==arr[j]){
            j--;
        }

        return arr[j];
    }

}
