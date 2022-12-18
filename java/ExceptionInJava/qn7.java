package ExceptionInJava;

public class qn7 {
    public static void main(String[] args)  {

        try {
            System.out.println("sum of two "+ (5+6));

        }
        catch (Exception e){
            e.printStackTrace();


        }
        finally {
            System.out.println("final balock");

        }
        System.out.println("this out of final");

    }



}
