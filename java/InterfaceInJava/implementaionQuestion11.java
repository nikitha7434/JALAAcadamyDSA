package InterfaceInJava;

public class implementaionQuestion11 implements question11{
   public static int  Rollno = 50;
    public static String name ="number";

    @Override
    public void print11() {
        System.out.println("this is print11");

    }
}
class subclassImpl{
    public static void main(String[] args) {


        implementaionQuestion11 impl = new implementaionQuestion11();

        System.out.println(" this is interface  :"+question11.name);

        System.out.println("this is implq question :"+impl.name);

        impl.print11();
    }

}
