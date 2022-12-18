package ThisAndSuper;

public class question1 {

  int id ;
    String name;
     boolean flag;
    double rate;
    char c='a';


    question1(int id,String name,boolean flag,double rate){
     this.id=id;
     this.name=name;
     this.flag=flag;
     this.rate=rate;


    }
    question1(int id,String name,boolean flag,double rate,char c){
        this(id,name,flag,rate);
        this.c=c;
    }



    void print(){
System.out.println(id+","+name+","+","+flag+","+" ,"+rate+","+c);
     }
     void printName(){
        System.out.println(this.name);
     }


    public static void main(String[] args) {

question1 q1=new question1(3,"raj",true,5.0);
question1 q=new question1(2,"hello",true,60.9,'a');
child ch =new child(4, "hiiiiii", false,67 );
childe ch1 =new childe(6,"hiii",true,45.09);

q.print();
q1.print();
ch1.print();
ch1.pp();
ch1.pn();

    }
}
class child extends question1{
    float secttion;
    child(int id, String name, boolean flag, double rate) {
        super(id, name, flag, rate);
    }

    child(int id, String name, boolean flag, double rate, float secttion) {
        super(id, name, flag, rate);
        this.secttion = secttion;
    }
}


class childe extends child{
    float secttion;

    childe(int id, String name, boolean flag, double rate) {
        super(id, name, flag, rate);
    }

    public childe(int id, String name, boolean flag, double rate, float secttion, float secttion1) {
        super(id, name, flag, rate, secttion);
        this.secttion = secttion1;
    }

    void pp(){

        System.out.println(super.c);
}
void pn(){
        System.out.println(this.name);
}

}
