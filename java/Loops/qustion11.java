package Loops;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class qustion11 {

    //Program to check whether a number is EVEN or ODD using switch
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int a = in.nextInt();

        switch (a%2){

            case (0):
                System.out.println("This is even number :"+a);
                break;

            case (1):
                System.out.println("This is odd number :"+ a);
                break;
            default:
                System.out.println("you not given a number ");

        }


    }
}
