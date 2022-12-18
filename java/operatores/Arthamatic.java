package operatores;

public class Arthamatic {
    public static void ArthamatiocOperatores(int a,int b){
        System.out.println("addition Operator : "+ (a+b));
        System.out.println("subtractions Operator"+ ": "+(a-b));
        System.out.println("multiplication Operator : "+(a*b));
        System.out.println("division Operator : "+(a/b));

    }
    private void InceramentAndDecrementOperators(int a,int b) {
        System.out.println("before Increment Operator :" + a++);
        System.out.println("after Increment Operator :" + a);

        System.out.println("before deIncrement Operator :" + b--);
        System.out.println("after deIncrement Operator :" + b);

    }

    public static void main(String[] args) {

        int a = 50;

        int b = 30;
        //Write a function for arithmetic operators(+,-,*,/)
        ArthamatiocOperatores(a,b);

        // Write a method for increment and decrement operators(++, --)
        Arthamatic arthamatic=new Arthamatic();

        arthamatic.InceramentAndDecrementOperators(a,b);



    }





}
