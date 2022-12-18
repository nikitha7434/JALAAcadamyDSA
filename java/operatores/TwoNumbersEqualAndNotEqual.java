package operatores;

import java.util.Scanner;

public class TwoNumbersEqualAndNotEqual {
    public static void main(String[] args) {
        //Program to equal operator and not equal operators

        Scanner in =new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();

        if(a==b){
            System.out.print("the two number are equal " + a +"," + b);
        }
        else {
            System.out.print("the two not number are equal " + a +"," + b);
        }

    }
}
