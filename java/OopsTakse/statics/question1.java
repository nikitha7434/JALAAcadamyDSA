package OopsTakse.statics;



public class question1 {

    static int id =4;
    static int amount =30;
    String name ;
    int fine;

    public question1() {
    }

    public question1(String name, int fine){
        this.name=name;
        this.fine=fine;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void printName(){
        question1 question1 =new question1();
        question1.setName("nikitha");

        System.out.println(question1.getName());
                question1.secondInstanceMethod();


    }
    static void PrintFine(){
        question1 question1 =new question1();
        question1.setFine(5);
        System.out.println("fine amount "+question1.getFine());
        question1.firstInstanceMethod();

    }
   void firstInstanceMethod() {


        PrintFine();
       System.out.println("this instance method 1"+amount);

   }
   void secondInstanceMethod(){
   printName();
   System.out.println("this intense method 2"+id);
   }

    public static void main(String[] args) {
        question1 question1=new question1();

        question1.firstInstanceMethod();;
        question1.secondInstanceMethod();
        printName();
        PrintFine();

    }


}
