package accessmodifierinJava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class question1 {

    private int id;
    private String name;


   private void printName(){
        System.out.println("print private number");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        question1 qn1 =new question1();

        qn1.setId(4);
        qn1.setName("nikitha");
          qn1.printName();

        System.out.println(qn1.getId());
        System.out.println(qn1.getId());

    }
}


class subclass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        question1 qn1 = new question1();

        qn1.setId(4);
        qn1.setName("nikitha");
        Method m=question1.class.getDeclaredMethod("printName");
        m.setAccessible(true);
        m.invoke(qn1);

        System.out.println(qn1.getId());
        System.out.println(qn1.getId());


    }
}