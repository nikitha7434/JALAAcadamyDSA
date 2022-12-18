package AbstractPackageInjava;

import static AbstractPackageInjava.question1.printstatic;

abstract class question1 {

    abstract void printName(String name);

    abstract  int printNumber(int number);
    static void printstatic(){
        System.out.println("this is non-abstract method");
    }
    static void printStaitc2(){
        System.out.println("this is non-abstract non static method");

    }


}
abstract class subclass{

    public static void main(String[] args) {
        question1 question1=new question1() {
            @Override
            void printName(String name) {
                System.out.println("this is subclass abstract method : "+name);

            }

            @Override
            int printNumber(int number) {
                return 1;
            }
        };
        question1.printName("nikitha");
        question1.printStaitc2();
        question1.printNumber(4565);
        printstatic();
    }

}
class subclass1{

    public static void main(String[] args) {
        question1 question1=new question1() {
            @Override
            void printName(String name) {
                System.out.println("this print subclass abostrat method");
            }

            @Override
            int printNumber(int number) {
                return 0;
            }
        };
    }
}

class subclass2{
    public static void main(String[] args) {
        question1.printstatic();
       question1.printStaitc2();
    }


}
