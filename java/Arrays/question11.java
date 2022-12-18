package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class question11 {

    public void removeofDuplicatieELement(int[] arr){
         int n= arr.length;
        Set<Integer> hs =new HashSet<>();

        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }

        int[] newarr = new int[hs.size()];

        Iterator itr =hs.iterator();
        int i=0;
        while(itr.hasNext()){
            newarr[i]= (int) itr.next();
            i++;
        }

        print(newarr);


    }
   static void print(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
   }
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int n =in.nextInt();
        int m=in.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] =in.nextInt();
        }

        int[] arr1 =new int[m];
        for(int i=0;i<m;i++){
            arr1[i]= in.nextInt();
        }

           commonelementTwoArray(arr,arr1);
            question11 question11=new question11();

           question11.removeofDuplicatieELement(arr);

           //Write a method to find number of even number and odd numbers in an array
        EvenandOdd(arr);

    }

    private static void EvenandOdd(int[] arr) {



        for(int i=0;i< arr.length;i++){
            if(arr[i]/2==0){
                System.out.print("even :"+ arr[i]+ " ");

            }else{
                System.out.println("odd :"+ arr[i]+" ");
            }
        }


    }


    private static void commonelementTwoArray(int[] arr, int[] arr1) {

        HashSet<Integer> hs;
        hs = new HashSet<>();

        for(int i=0;i< arr.length;i++){
            hs.add(arr[i]);
        }

        for(int i=0;i< arr1.length;i++){
            if(hs.contains(arr1[i])){
                System.out.print("common elenment two array " +arr1[i]+ " ");
            }
        }

    }
}
