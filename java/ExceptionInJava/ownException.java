package ExceptionInJava;

public class ownException extends Exception{

    public ownException(){
        super("This ownException created");
    }
}
class qu6{
    public static void main(String[] args) {
        try{
            throw new ownException();
        }catch (ownException e){
            System.out.println(e.getMessage());
        }
    }
}