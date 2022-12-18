package accessmodifierinJava;



public class question1And2 {

    public static void main(String[] args) {
        int[] arr ={1,2,2,3,56,8};

       int sum= addIntegerarr(arr);
       averageArr(sum,arr.length);
    }

    private static void averageArr(int sum, int length) {

        System.out.println(sum/2);
    }

    private static int  addIntegerarr(int[] arr) {
        int add=0;
        for(int i=0;i<arr.length;i++){
            add+=arr[i];
        }
        return add;
    }
}
