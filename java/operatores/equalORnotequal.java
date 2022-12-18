package operatores;

public class equalORnotequal {
    public static void main(String[] args) {
        int a=5;
        int b=9;
        EqualAndnotequal(a,b);

    }
    public static void EqualAndnotequal(int a ,int b){

        System.out.println("this is equal sign : "+ "a ==b "+a+" ,"+b+":"+ (a==b));
        System.out.print("this is equal sign : "+ " a!= b "+ a+" ,"+b +":" +(a!=b));

    }
}
