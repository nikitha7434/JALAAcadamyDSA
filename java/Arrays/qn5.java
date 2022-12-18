package Arrays;

import java.util.Scanner;

public class qn5 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int size = input.nextInt();
        // creat  array
        int[] arr =new int[size];
        // taking element in input
        for (int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }


        CopyOfArray(arr);
        System.out.println("entre spicefic index and element ");

        int index1 = input.nextInt();
        int ele =input.nextInt();

        incerectSpecificIndex(index1,ele,arr);
// Write a function to find the minimum and maximum value of an array
        MINANDMAXele(arr,size);

        reverseArray(arr);

        // Write a function to find the duplicate values of an array
        DuplicateArray(arr,size);

    }

    private static void DuplicateArray(int[] arr, int n) {

        for(int i=0;i<n;i++){ //outter loop
            for(int j=0;i<n;j++){

                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }

    private static void reverseArray(int[] arr) {

        for(int i=0;i< arr.length;i++){
            arr[i]=arr[arr.length-1-i];
        }
        System.out.println("reverse array ");
        printArr(arr);
    }

    private static void MINANDMAXele(int[] arr, int size) {

        int max =Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){

            if(max<arr[i]){
                max =arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("max ele :"+max +" min ele :"+min);
    }

    private static void incerectSpecificIndex(int index1, int ele, int[] arr) {

        arr[index1]=ele;
        System.out.println("after insert element arr is");
        printArr(arr);
    }

    private static void CopyOfArray(int[] arr) {

        int[] copyarr =new int[arr.length];
        //create a new array copy of element

        for (int i=0;i< arr.length;i++){
            copyarr[i]=arr[i];
        }

       printArr(copyarr);


        // using clone method
        // cpyarr =arr.clone();
        //copyarr =System.copyarray(arr);
        //copyarr =Arrays.copy(arr);


    }
    static void printArr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
