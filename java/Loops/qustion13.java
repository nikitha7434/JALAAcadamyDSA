package Loops;

public class qustion13 {
    //13. Program for multiple if else statement(Largest number in 10,20 and 30)
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;


        if(a>b){

            if(a>c){
                System.out.println("Largest number is "+ a);
            }
            else {
                System.out.println("Largest number is "+ c);
            }
        }
        else{
            if(b>c){
                System.out.println("Largest number is "+b);
            }
            else {
                System.out.println("Largest number is "+ c);
            }
        }
    }
}
