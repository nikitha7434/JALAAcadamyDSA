package Arrays;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class qn3 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int size = input.nextInt();
        // creat  array
        int[] arr =new int[size];
        // taking element in input
        for (int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }

        //3. Write a program to find the index of an array element

       FindIndexOfArray(arr,size);

        //Write a function to test if array contains a specific value

        System.out.println("enter spcific value ");

        int spcificValue =input.nextInt();

    boolean flag1=   containSpecticValue(size,arr,spcificValue);
       //decleration
        if(flag1){
            System.out.println(" In array contain you given value " +spcificValue);
        }else{
            System.out.println("In array not contain you given value :"+spcificValue);
        }


//5. Write a function to remove a specific element from an array
        System.out.println("enter specific value you want to remove it");

        int  removeValue = input.nextInt();
       boolean flag= containSpecticValue(size,arr,removeValue);

        if(flag){
            removeSpecificElementArray(size,arr,removeValue);
        }else{
            System.out.println("In array not contain you given value :"+removeValue);
        }
    }

    private static void removeSpecificElementArray(int size, int[] arr, int spcificValue) {



        int[] arr2 =new int[size-1];
        int k=0;

        for(int i=0;i< arr.length;i++){

            if(arr[i]!=spcificValue){
                arr2[k++]=arr[i];
            }

        }

        System.out.println("before removing element is :"+arr.toString());

      System.out.println("after remove element new array is :" + Arrays.toString(arr2));


    }

    private static boolean containSpecticValue(int size,int[] arr,int spcificValue) {

boolean flag=false;

        for(int i=0;i<size;i++){
            if(arr[i]==spcificValue){ //checking
                flag =true;

            break;
            }
        }
        //deceleration

      return flag;
    }

    private static void FindIndexOfArray(int[] arr, int size) {

        for (int index=0;index<size;index++){
            System.out.println("index :"+ index+ " ArrayOfindex :"+arr[index]);
        }
    }
}
