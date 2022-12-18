package Loops;

import java.util.Scanner;

public class quastion4 {
    public static void main(String[] args) {

        //Write a program to print the odd and even numbers.
        Scanner input =new Scanner(System.in);

        int a =input.nextInt();

        if(a%2==0){
            System.out.println("this even number :"+ a);
        }
        else{
            System.out.println("this is Odd number :"+a);
        }
    }
}
