public class Reverse {
    public static void Solution(int array[]){
        int F=0;
        int L=array.length-1;
        while (F<L) {
            //swap
            int temp=array[L];
            array[L]=array[F];
            array[F]=temp;
            F++;
            L--;
            
        }

        

    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};

        
        Solution(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print( + array[i] + " ");
        }

        

        
    }
    
}
