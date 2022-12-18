package Collections;

import java.util.HashMap;

import java.util.Scanner;

public class questaion2 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

//        Create a HashMap with at least 10 key value pairs of the Student ID and Name


        HashMap<Integer,String >hashMap=new HashMap<>();
        hashMap.put(1,"stu1");
        hashMap.put(2,"stu2");
        hashMap.put(3,"st3");
        hashMap.put(4,"st3");
        hashMap.put(5,"st3");
        hashMap.put(6,"st3");
        hashMap.put(7,"st3");
        hashMap.put(8,"st3");
        hashMap.put(9,"st3");
        hashMap.put(10,"st3");

        System.out.println("Fetch the value of a Key ");
        int key =in.nextInt();
        hashMap.get(key);


        System.out.println(" Insert a Key value mapping into the map");

         key =in.nextInt();
        String stuName =in.next();
        hashMap.put(key,stuName);

  System.out.println(" Check if the given Key is in the Map");
  key=in.nextInt();
  hashMap.containsKey(key);

  System.out.println(" Check if the value is in the Map");
  stuName =in.next();
  hashMap.containsValue(stuName);

  //   Check if the map is empty
        hashMap.isEmpty();

        //Print the size of the Map to the console
        System.out.println("the size of the Map :" +hashMap.size());

        System.out.println("Print all the Keys of the map to the console");
        System.out.println(hashMap.keySet());

        System.out.println("Print all the values of the map to the console");
        System.out.println(hashMap.values());

        System.out.println(" Remove a specific Key-value pair");
        key=in.nextInt();
        stuName=in.next();
        hashMap.remove(key,stuName);

        System.out.println(" create a clone/copy of HashMap");
        hashMap.clone();

        System.out.println(" Copy all the elements of the Map to another Map");

        HashMap<Integer,String> hashMap1 =new HashMap<>();
        hashMap1.putAll(hashMap);


    }
}
