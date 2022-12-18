package ExceptionInJava;

public class qn83 {
    public static void main(String[] args) {

        String name = "nikitha";
        try {
            System.out.println("string out index" + name.charAt(name.length()));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

}
