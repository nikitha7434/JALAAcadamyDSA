package operatores;

import java.util.Scanner;

public class smalleterAndLarger {
    public static void main(String[] args) {
        //Print the smaller and larger number

        int maxele =Integer.MAX_VALUE;
        int minele =Integer.MIN_VALUE;
        System.out.println("smaller element : "+ minele);
        System.out.println("larger  element : "+ maxele);

   int max =Integer.MIN_VALUE;
   int  min =Integer.MAX_VALUE;

        Scanner input =new Scanner(System.in);
        int length =input.nextInt();
        int[] arr =new int[length];
        // taking input
        for(int i=0;i<length;i++){
            arr[i]=input.nextInt();
        }
        input.close();

        for(int i=0;i<length;i++){

            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min =arr[i];
            }
        }
         System.out.println("in arr larger element "+max);
        System.out.println("in  arr smaller ele " + min);
    }
}
