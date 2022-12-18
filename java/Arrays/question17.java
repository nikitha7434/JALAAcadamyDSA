package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size = input.nextInt();
        // creat  array
        int[] arr =new int[size];
        // taking element in input
        for (int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }


        //Write a method to verify if the array contains two specified elements(12,23)

        //using binary search alogarithum
        System.out.println(" element 12 is "+FindElementByUsingBinarySearchALgo(arr,12));
        System.out.println("element 23 is" +FindElementByUsingBinarySearchALgo(arr,23));

    }

    private static boolean FindElementByUsingBinarySearchALgo(int[] arr, int i) {

        int low =0;
        int high = arr.length;
        int mid =0;
        Arrays.sort(arr); //using merge sort Algoriitun internally

        while (low<=high){

            mid=(low+high)/2;


            if( arr[mid]<i){
                low=mid+1;
            }
            else if(arr[mid]>i){
                high=mid-1;
            }

            else{//arr[i] ==i;
                return true;
            }

        }



        return false;
    }
}
