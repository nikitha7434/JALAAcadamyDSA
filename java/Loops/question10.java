package Loops;

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        //Write a program to palindrome or not

        Scanner in =new Scanner(System.in);
        String inputname =in.next();

        //check is polindrome
       if(checkPalindrome(inputname)){
           System.out.println("It is palindrome :"+ inputname);
       }
       else{
           System.out.println("it is not palindrome :"+ inputname);
       }


    }

    private static boolean checkPalindrome(String inputname) {
        // string to char array
        char[] ch =inputname.toCharArray();
        int n =ch.length;

        for (int i=0;i<ch.length/2;i++){

            if(ch[i]!=ch[n-1-i]){
                return false;

            }
        }

        return true;
    }


}
