package ExceptionInJava;


import java.io.IOException;
import java.util.Scanner;

public class qns3 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        try {
            System.out.println("sum :" + (a + b + c));
            try {

                System.out.println("multiplication :" + (a * b * c));
                try {
                    System.out.println("division of there number is :" + (a / b + c));
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}

 // class qn12{
//        public static void main(String[] args) {
//
//            Scanner in =new Scanner(System.in);
//            try {
//              int  a =in.nextInt();
//          b=in.nextInt();
//            }catch ( NoSuchFieldException e){
//                e.printStackTrace();
//            }
//
//        }
//    }
//}


