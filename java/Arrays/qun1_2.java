package Arrays;

import java.util.Scanner;

public class qun1_2 {
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

        int sumofarr = addInteger(arr);

        System.out.println(" Write a function to add integer values of an array : "+sumofarr);

     int avg=   AverageOfIntegers(sumofarr,size);

     System.out.println("average arr : "+ avg);

    }
    //Write a function to calculate the average value of an array of integers

    private static int AverageOfIntegers(int sumofarr,int size) {

        return sumofarr/size;


    }
    /* 1. Write a function to add integer values of an array*/

    private static int addInteger(int[] arr) {
        int sum=0;

        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }


}
