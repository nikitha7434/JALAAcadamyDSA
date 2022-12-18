package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class questaion1 {
    public static void main(String[] args) {



        Scanner in =new Scanner(System.in);


        ArrayList<String> arrayList = new ArrayList<>();
       arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        arrayList.add("test4");
        arrayList.add("test5");
        arrayList.add("test6");
        arrayList.add("test7");
        arrayList.add("test8");
        arrayList.add("test9");
        arrayList.add("test10");

        System.out.println("Add an element to the ArrayList");
        String ele =in.next();
        arrayList.add(ele);

        System.out.println("Iterate through the ArrayList by using Iterator object");
        IterateArrayList(arrayList);

      System.out.println(" Add an element at a specific index");
         ele = in.next();
        int index =in.nextInt();

        if(index<=arrayList.size()) {
            arrayList.add(index, ele);
        }else{
            System.out.println("given geater then size of array");
        }

        System.out.println("Remove an element from the ArrayList, Remove at an index");
        index =in.nextInt();
        arrayList.remove(index);

        System.out.println("Update the element at a specific index");
        index=in.nextInt();
        ele=in.next();
        arrayList.add(index,"orange");



        System.out.println(" Check the element is present at a particular index");
        ele =in.next();
      if (arrayList.indexOf(ele)>=0){
          System.out.println("the element is present at a particular index");

      }else{
          System.out.println("the element is not present at a particular index");
      }


        System.out.println("Get an element at a particular index");
       index =in.nextInt();
       System.out.println("Get an element at a particular index :"+arrayList.get(index));

       System.out.println("Find out the size of the ArrayList");
       System.out.println( " Find out the size of the ArrayList"+arrayList.size());

       System.out.println("Check the given element is present in the ArrayList");

       String elepresnt=in.next();
        System.out.print(" Check the given element is present in the ArrayList :"+arrayList.contains(elepresnt));

        System.out.println("Remove all elements of the ArrayList");
         arrayList.clear();


    }

    private static void IterateArrayList(ArrayList<String> arrayList) {

        for(Iterator iter = arrayList.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
    }


}
