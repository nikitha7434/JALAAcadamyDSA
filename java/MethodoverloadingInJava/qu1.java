package MethodoverloadingInJava;

public class qu1 {

    static void AgrMethod(int id ){
        System.out.println("this is id :"+id);
    }
    static void AgrMethod(int id,int name){
        System.out.println("this is id :"+id + "this is name :"+ name);
    }
    static void ArgMethod2(int id,String name){
        System.out.println("this is id :"+id +"this is name :"+name);
    }
    static void ArgeMethod2(int id, boolean flag){
        System.out.println("this is id :"+ id + "this is flag "+flag);
    }

    static void ArgMethod3(double id,long number){
        System.out.println("this is id :"+ id +" thid number :"+ number);

    }

    static void ArgMethod3(long id,double number){
        System.out.println("this is id :"+ id +" thid number :"+ number);

    }
    static void AgeMethod5(double hi){
System.out.println("this is id"+hi);
    }
    static void AgeMethod5(long hi){
        System.out.println("this is id"+hi);
    }
     static String ArgMethod4(String name){
        return name;
     }
     static int ArgMethod4(boolean name){
        return 0;
    }

    public static void main(String[] args) {
       AgrMethod(2);
    AgrMethod(3,4567);
    ArgMethod2(5,"hi");
    ArgeMethod2(78,true);
    ArgMethod3(2.0,5);
    ArgMethod3(5,2.5);
    ArgMethod4("hello");
    ArgMethod4(true);
    AgeMethod5(2.80);
    AgeMethod5(5l);

    }
}
