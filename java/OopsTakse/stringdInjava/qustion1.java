package OopsTakse.stringdInjava;

import java.util.Scanner;

public class qustion1 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        // taking string two type
        String name1 = in.next();
        String name2 = in.nextLine();
        // direct declaring
        String name = "nikitha";

        //. Concatenating two strings using + operator
        String concentrateTwoString = name1 + name2;

        //Finding the length of the string
        int length = concentrateTwoString.length();

        //Extract a string using Substring
        String subString = concentrateTwoString.substring(1, 5);

        // Searching in strings using indexOf()
        System.out.println("entre index ");
        int index =in.nextInt();
        concentrateTwoString.indexOf(index);

        System.out.println(" Comparing strings using the methods equals(),");

        System.out.println("compare to string "+  name2.equals(name2));

        System.out.println(" Replacing characters in strings with replace()");
        name1.replace('i','u');

        System.out.println("Splitting strings with split()");
        name1.split(" ",5);

        System.out.println(". Converting Numbers to Strings with valueOf()");
        int number =9;
        String number2 =String.valueOf(number);

        System.out.println(" Converting integer objects to Strings");
        question question=new question();
         String object =question.toString();

         System.out.println("Converting to uppercase and lowercas");
         String tolowwercase =name.toUpperCase().toLowerCase();

         System.out.println(" 9. Trimming strings with trim()");
       String trimename=  name1.trim();

       System.out.println("equalsIgnoreCase(), startsWith(), endsWith() and compareTo()\n");

       name1.startsWith("names");
       name1.endsWith("!");
       name1.compareTo(name2);
       name1.equalsIgnoreCase(name2);

       System.out.println("Matching a String Against a Regular Expression With matches()");

       String st =new String("Welcome to tavaAcadmy");
       System.out.println(st.matches("welcome .*"));

    }


}
