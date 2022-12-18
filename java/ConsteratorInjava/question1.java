package ConsteratorInjava;

public class question1 {

    int id ;
    int number;

    public question1() {
    }

    question1(int id) {
        this.id = id;
    }
    question1(int id,int nmber){
        this.id=id;
        this.number=number;
    }

    public static void main(String[] args) {
        question1 question1=new question1(3);
        question1 question11=new question1(34,89);
    }
}
class subclassquestion1 extends question1{

    public static void main(String[] args) {
    question1 qun1 =new question1();
    question1 question1=new question1(2);
        question1 qun2=new question1(3,56);

    }

}
class Base{
    int nuber;
    int id;
    String name;
    boolean flag;
    Base(){}

    private Base(boolean flag,String name){
        this.name=name;
        this.flag =flag;
    }
    protected Base(int id){
        this.id=id;
    }
    public Base(int id,int number){
        this.id =id;
        this.nuber=number;

    }
    int Base(int id){
        this.id=id;
        return id;
    }
    String Base(){

        return name;
    }

    public static void main(String[] args) {
        Base b=new Base();
        Base b1=new Base(true,"kala");
        Base b2=new Base(2,67);
        b2=new Base(3,5);
        b2=new Base(false,"ramesh");
        String name = b1.Base();
    }
}