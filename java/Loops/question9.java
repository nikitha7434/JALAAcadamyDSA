package Loops;


import java.util.Arrays;
import java.util.Scanner;

public class question9 {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int num =in.nextInt();
     System.out.println("Given number is: "+isprime(num));
     primeNumberToN(num);
    }

    private static void primeNumberToN(int num) {

        // create new array
        //sieve of Eratosthenss
        int[] arr=new int[num+1];
        Arrays.fill(arr,-1);
        for(int i=2;i*i<=num;i++) {

            if(arr[i]==-1){
                for (int j=i*i;j<=num;j=j+i){
                    arr[j]=0;
                }
            }

        }

        for(int i=0;i<=num ;i++){
            if(arr[i]==-1) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isprime(int num) {

        if(num==2 || num==3 ){
            return true;
        }

        for(int i=2;i*i<=num ;i++){

            if(num%i==0){
                return false;
            }
        }
        return true;
    }


}
