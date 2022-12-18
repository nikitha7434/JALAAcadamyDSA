package OopsTakse.InheritanceInjava;

public class questionAnswer {
    public static void main(String[] args) {

        A a=new A(5);

        B b=new B(6);
        C c=new C(10);

        a.print();
        a.print1();
        a.supermethod();

        b.print3();
        b.print4();
        b.supermethod();

        c.print4();
        c.print5();
        c.subcllass();

       A a1 =new B(45);
       a1.supermethod();

       A a2 =new C(47);
       a2.supermethod();

    }


}
class A{
    int a ;

    public A(int a) {
        this.a = a;
    }

    void print(){
        System.out.println("this is super class"+a);
    }
    void print1(){
        System.out.println("this i ssenocd method of super class"+ a);

    }
    void supermethod(){
        System.out.println("this is supermethod is super class"+ a);
    }
}
class B extends A{

    public B(int a) {
        super(a);
    }

    void print3(){
System.out.println("this print method in  class B"+a);
    }
    int  print4(){
        System.out.println("this is ptint method 2 in class B"+a);
        return 0;
    }

    @Override
    void supermethod(){
        System.out.println("this is supermethod is sub  class B"+a);
    }


}
class C extends B{

    public C(int a) {
        super(a);
    }

    @Override
   int print4(){
        System.out.println("this i sprint method 1 in class C");
        return  1;
    }

    void print5(){
        System.out.println("this is method 2 in class c"+a);
    }
    void subcllass(){
        System.out.println("this is subclass method in class c"+a);
    }

}