class Pair {
    int min;
    int max;

    Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
public class MaxAndMin {
    // find Min Value..
    public static int MinValue(int array[]){
        int Min=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(Min>array[i]){
                Min=array[i];

            }
            
        }
        return Min;
    
    }
    // find  Max Value 
    public static int MaxValue(int array[]){
        int Max=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(Max<array[i]){
                Max=array[i];

            }
            
        }
        return Max;

    
    }
    // Find ,ax amd mn both 

    public static int Solution(int array[]){

      
        int Min= Integer.MAX_VALUE;
        int Max=Integer.MIN_VALUE;
       
        for (int i = 0; i < array.length; i++) {
            if (Min>array[i]) {
                Min=array[i];
                
            }
            if(Max<array[i]){
                Max=array[i];

            }
            
        }
       

        return new Pair(Min, Max);
    
    }
    
    public static void main(String[] args) {
        // array
        int array[]={2,5,6,3,9,23,4,1,-2};

        int minimun=MinValue(array);
        int maximum=MaxValue(array);
        System.out.println("max Value = "+ maximum+"  min value= "+ minimun);
        
        Pair result = Solution(array);
        System.out.println("Using Solution method: Max Value = " + result.max + ", Min Value = " + result.min);


        

        
    }
}
