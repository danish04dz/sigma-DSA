public class LargestinArray {
    public static int Getlargest(int array[]){
        int large=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(large<array[i]){
                large=array[i];

            }
        }

        return large;
    }
    public static void main(String[] args) {
        int array[]={2,3,2,4,6,2,4,9,7,6,4,2};

        int large=Getlargest(array);
        System.out.println(large);

    }
}
