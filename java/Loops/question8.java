package Loops;

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        //8. Write a program to find Armstrong number or not

        Scanner in =new Scanner(System.in);

        int a = in.nextInt();

        // given number comvert string
        String num =String.valueOf(a);
        int length =num.length();


        // checking

        if(isAmstrong(a,length)){
            System.out.println("This is amstrong number :" +a);
        }
        else{
            System.out.println("This is not amstrong number :"+ a);
        }
    }

    private static boolean isAmstrong(int a, int length) {

        int totalDigitSum=0;
        int temp=a;
        while(a>0){

            int singledigit =a%10;
            //System.out.println(singledigit);
            totalDigitSum +=(int)Math.pow(singledigit,length);
            a=a/10;

        }


        return (totalDigitSum == temp);
    }
}
