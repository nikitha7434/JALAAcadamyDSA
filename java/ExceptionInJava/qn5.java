package ExceptionInJava;

public class qn5 {
    public static void main(String[] args) {


        try {
            int arr[] = {1, 3, 4, 5};
            for (int i = 0; i <=arr.length; i++) {

                if(i==arr.length){
                    throw new Exception("index  not found : "+ i);
                }
                        System.out.println("arr index " + arr[i]);

            }

        }catch (Exception e){
          System.out.println("this is own exception" + e);
        }
    }
}
