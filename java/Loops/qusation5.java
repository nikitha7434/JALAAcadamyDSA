package Loops;

import java.util.Scanner;

public class qusation5 {
    public static void main(String[] args) {
        //Write a program to print largest number among three numbers.

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


int large1 =a>b?(a>c? a : c ) : (b>c?b:c);
        System.out.println(large1);
    }
}
