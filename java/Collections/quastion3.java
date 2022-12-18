package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class quastion3 {
    public static void main(String[] args) {
//        Create a HashSet with at least 10 elements of type String
//        Write program covering all the operations of HashSet

        Scanner in =new Scanner(System.in);

        HashSet<Integer> hashSet=new HashSet<>();
      for(int i=1;i<11;i++){
          hashSet.add(i);
      }
System.out.println("adding element enter number");
        int ele = in.nextInt();
      hashSet.add(ele);
// checking element
        System.out.println("checking ele plz entre number");
        int check = in.nextInt();
        System.out.println("result is :" + hashSet.contains(check));


    }
}
