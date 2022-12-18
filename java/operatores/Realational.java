package operatores;

import java.util.Scanner;

public class Realational {

    //Program for relational operators (<,<==, >, >==)
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a == b) {
            System.out.println("relational operator a==b equal");

        } else if (a < b) {
            System.out.println("relational operator a<b less");

        } else if (a > b) {
            System.out.println("relational operator a>b grater");

        } else if (a >= b) {
            System.out.println("relational operator a>=b greater then equal");

        } else if (a <= b) {
            System.out.println("relational operator a<=b less then equal");

        }
    }
}
