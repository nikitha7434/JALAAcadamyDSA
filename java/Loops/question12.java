package Loops;

import java.util.Scanner;

public class question12 {
    //Print gender (Male/Female) program according to given M/F using switch
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        char gender =in.next().charAt(0);
        if(gender=='F'){
            System.out.println("Female");

        }
        else{
            System.out.println("Male");
        }
    }
}
