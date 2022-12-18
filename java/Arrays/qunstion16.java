package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class qunstion16 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size = input.nextInt();
        // creat  array
        int[] arr =new int[size];
        // taking element in input
        for (int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        DiffernceBetweenMInAndMax(arr,size);

        //Write a function to find the missing number of sorted array of 1 to 100*/
        Arrays.sort(arr);
      qunstion16 qn =new qunstion16();
      qn.MissingNumber(arr,size);

    }
    private void MissingNumber(int[] arr, int size) {
        List<Integer> list =new ArrayList<>();

        for(int i=0;i<size;i++){
            list.add(arr[i]);
        }

        for(int i=1;i<=100;i++){
            if(!list.contains(i)){
                System.out.println("missing i to 100 is :");
                System.out.println( i+ " ,");
            }

        }



    }

    private static void DiffernceBetweenMInAndMax(int[] arr, int size) {

        int max =Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("differnce between min and max is :"+ max+"- "+ min+"= "+ (max-min));

    }
}
