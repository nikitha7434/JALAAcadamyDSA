package ExceptionInJava;

public class qn82 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 3, 5, 7};

            for (int i = 0; i <= arr.length; i++) {
                arr[i] = arr[i];
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
