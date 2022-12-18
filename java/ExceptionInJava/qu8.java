package ExceptionInJava;

import operatores.Arthamatic;

import java.io.IOException;
import java.util.Scanner;

public class qu8 {

    public static void main(String[] args) {
        try {
            System.out.println(6/0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}

