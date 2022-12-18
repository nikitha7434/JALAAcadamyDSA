package Loops;

public class question6 {
    public static void main(String[] args) {
        //Write a program to print even number between 10 and 100 using while

        int number =10;

        while(number<=100){
            if(number%2==0){
                System.out.println(number);
            }
            number++;
        }
    }
}
