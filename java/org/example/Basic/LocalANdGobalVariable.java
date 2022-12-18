package org.example.Basic;

public class LocalANdGobalVariable {
//    Define the local and Global variables with the same name and print both variables and
//    understand the scope of the variable
   public String name  ="nikitha";

    public static void main(String[] args) {
        String name ="kala";

        LocalANdGobalVariable localANdGobalVariable=new LocalANdGobalVariable();
        System.out.println("local variable :" +name);
        System.out.println("Global variable :"+localANdGobalVariable.name);

    }
}
